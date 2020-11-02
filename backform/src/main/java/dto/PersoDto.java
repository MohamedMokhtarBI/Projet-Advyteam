package dto;

public class PersoDto {

    private Long id;

    private String name;
    private String prenom;
    private String email;
    private int age ;
    private String adresse ;
    private  String mdp;

    public PersoDto(Long id, String name, String prenom , String email , String adresse , int age) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.age=age;
        this.adresse=adresse;
        this.email=email ;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public PersoDto() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
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

}
