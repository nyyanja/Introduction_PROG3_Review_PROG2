package com.Nj.code;

import java.util.Date;

public class Tuteur extends Personne{
    private String relation;

    public Tuteur(int id, String nom, String prenom, Date dateNaissance, String email, int numeroTelephone) {
        super(id, nom, prenom, dateNaissance, email, numeroTelephone);
    }

    public String getRelation() {
        return relation;
    }
}
