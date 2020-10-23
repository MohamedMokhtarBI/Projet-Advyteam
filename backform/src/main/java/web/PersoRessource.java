package web;


import domain.Perso;
import org.springframework.web.bind.annotation.PathVariable;
import service.imp.PersoServiceImpl;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersoRessource {


    @Inject
    PersoServiceImpl persoService;

    @GET
    @Path("/select")
    @Produces(MediaType.APPLICATION_JSON)
    public Response FindPersos() {
        return Response.ok().entity(persoService.getAllPerso()).build();
    }


    @POST
    @Path("/take")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response takePerso(Perso p) {

        return Response.ok().entity(persoService.addPerso(p)).build();

    }

    //delete BY ID
  @DELETE
  @Path("/delete/{id}")
    public void deleteUser(@PathParam("id") Long id){

      persoService.deleteUsers(id);

  }


    //delete ALL USERS
    @DELETE
    @Path("/delete")
    public void deleteallUsers(){

        persoService.deleteallUsers();

    }
}

