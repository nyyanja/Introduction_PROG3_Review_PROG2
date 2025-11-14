package com.Nj.code;

import java.util.Date;


public class Etudiant extends Personne{
    private String groupe;
    private Tuteur tuteur;
    private Note[] notes;

    public Etudiant(int id, String nom, String prenom, Date dateNaissance, String email, int numeroTelephone, String groupe, Tuteur tuteur, Note[] notes) {
        super(id, nom, prenom, dateNaissance, email, numeroTelephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
        this.notes = notes;
    }

    public String getGroupe() {
        return groupe;
    }

    public Tuteur getTuteur() {
        return tuteur;
    }
    public Note[] getNotes() {
        return notes;
    }
}
