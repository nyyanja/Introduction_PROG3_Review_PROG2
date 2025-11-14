package com.Nj.code;

import java.time.Instant;

public class ChangementDeNote {
    private float noteInitiale;
    private float noteFinale;
    private Instant dateChangement;
    private String motif;

    public ChangementDeNote(float noteInitiale, float noteFinale, Instant dateChangement, String motif) {
        this.noteInitiale = noteInitiale;
        this.noteFinale = noteFinale;
        this.dateChangement = dateChangement;
        this.motif = motif;
    }

    public float getNoteInitiale() {
        return noteInitiale;
    }
    public float getNoteFinale() {
        return noteFinale;
    }
    public Instant getDateChangement() {
        return dateChangement;
    }
    public String getMotif() {
        return motif;
    }
}
