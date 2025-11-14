package com.Nj.code;

public class Note {
    private Etudiant etudiant;
    private Examen examen;
    private HistoriqueDeChangementDeNote historique;

    public Note(Etudiant etudiant, Examen examen, HistoriqueDeChangementDeNote historique) {
        this.etudiant = etudiant;
        this.examen = examen;
        this.historique = historique;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public Examen getExamen() {
        return examen;
    }

    public HistoriqueDeChangementDeNote getHistorique() {
        return historique;
    }


    public double getExamGrade(Examen exam, Etudiant student, java.time.Instant t) {
        return historique.getChangements().stream()
                .filter(changement -> !changement.getDateChangement().isAfter(t))
                .map(ChangementDeNote::getNoteFinale)
                .reduce((first, second) -> second)
                .orElseThrow(() -> new IllegalStateException("Aucune note trouvée."));
    }

    public double getFinalGradeForSubjectAtTime(Etudiant student, Matiere subject, java.time.Instant t) {
        return student.getNotes() == null ? 0.0 : java.util.Arrays.stream(student.getNotes())
                .filter(note -> note.getExamen().getMatiere().equals(subject))
                .mapToDouble(note -> note.getExamGrade(note.getExamen(), student, t) * note.getExamen().getCoefficient().getValue())
                .sum() / java.util.Arrays.stream(student.getNotes())
                .filter(note -> note.getExamen().getMatiere().equals(subject))
                .mapToDouble(note -> note.getExamen().getCoefficient().getValue())
                .sum();
    }
}

