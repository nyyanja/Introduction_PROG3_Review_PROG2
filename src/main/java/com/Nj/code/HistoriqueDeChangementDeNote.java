package com.Nj.code;

import java.util.List;

public class HistoriqueDeChangementDeNote {
    private List<ChangementDeNote> changements;

    public HistoriqueDeChangementDeNote(List<ChangementDeNote> changements) {
        this.changements = changements;
    }

    public List<ChangementDeNote> getChangements() {
        return changements;
    }

}
