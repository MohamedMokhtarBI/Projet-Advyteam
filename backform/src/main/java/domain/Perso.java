package domain;

import javax.persistence.*;

@Entity
@Table(name = "perso")
public class Perso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

    private String name;
    private String prenom;

    public Perso(Long id, String name, String prenom) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Perso() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Perso{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
