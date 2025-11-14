package com.Nj.code;

import java.util.Date;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private int numeroTelephone;

    public Personne(int id, String nom, String prenom, Date dateNaissance, String email, int numeroTelephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.numeroTelephone = numeroTelephone;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public int getNumeroTelephone() {
        return numeroTelephone;
    }
}
