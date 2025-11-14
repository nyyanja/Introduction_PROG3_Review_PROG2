package com.Nj.code;

public class Matiere {
    private  int id;
    private Label label;
    private int credits;
    private Enseignant enseignant;

    public Matiere(int id, Label label, int credits, Enseignant enseignant) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
    }
    public int getId() {
        return id;
    }
    public Label getLabel() {
        return label;
    }
    public int getCredits() {
        return credits;
    }
    public Enseignant getEnseignant() {
        return enseignant;
    }
}
