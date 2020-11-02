package service;

import domain.Perso;

import java.util.List;

public interface PersoService  {

    Perso addPerso(Perso perso);

    List<Perso> getAllPerso();

    List<Perso> deleteUsers(long id) ;


    List<Perso> deleteallUsers();





}
