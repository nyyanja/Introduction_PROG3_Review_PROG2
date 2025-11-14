package com.Nj.code;

import java.util.Date;

public class Enseignant extends Personne{
    private Specialite specialite;

    public Enseignant(int id, String nom, String prenom, Date dateNaissance, String email, int numeroTelephone) {
        super(id, nom, prenom, dateNaissance, email, numeroTelephone);
    }
}
