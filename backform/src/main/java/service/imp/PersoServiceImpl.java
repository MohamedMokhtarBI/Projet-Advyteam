package service.imp;

import domain.Perso;
import org.springframework.web.bind.annotation.PathVariable;
import repository.PersoRepository;
import service.PersoService;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class PersoServiceImpl implements PersoService {

    @Inject
    private PersoRepository persoRepository;


    @Override
    public Perso addPerso(Perso perso) {
        return persoRepository.save(perso);
    }

    @Override
    public List<Perso> getAllPerso() {
        return persoRepository.findAll();
    }

    @Override
    public void deleteUsers(long id)
    {
       persoRepository.deleteById(id);
    }
 public void deleteallUsers(){

        persoRepository.deleteAll();
 }


}
