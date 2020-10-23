package service;

import domain.Perso;

import java.util.List;

public interface PersoService  {

    Perso addPerso(Perso perso);

    List<Perso> getAllPerso();

    void deleteUsers(long id) ;
    void deleteallUsers();





}
