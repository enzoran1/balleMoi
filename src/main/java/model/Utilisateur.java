package model;

public class Utilisateur {
    private String prenom;
    private String nom;

    private int age;

    private boolean majeur;

    public Utilisateur(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.majeur = age >= 18;
    }

    public boolean isMajeur() {
        return majeur;
    }

    //public void setMajeur(boolean majeur) {
       // this.majeur = majeur;
    //}

    public void setNom(String nom) {
        this.nom = nom;
    }
}
