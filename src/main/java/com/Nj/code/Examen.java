package com.Nj.code;

import java.time.LocalDateTime;

public class Examen {
    private int id;
    private String Titre;
    private Matiere matiere;
    private LocalDateTime dateHeure;
    private Coefficient coefficient;

    public Examen(int id, String titre, Matiere matiere, LocalDateTime dateHeure, Coefficient coefficient) {
        this.id = id;
        Titre = titre;
        this.matiere = matiere;
        this.dateHeure = dateHeure;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }
    public String getTitre() {
        return Titre;
    }
    public Matiere getMatiere() {
        return matiere;
    }
    public LocalDateTime getDateHeure() {
        return dateHeure;
    }
    public Coefficient getCoefficient() {
        return coefficient;
    }

}
