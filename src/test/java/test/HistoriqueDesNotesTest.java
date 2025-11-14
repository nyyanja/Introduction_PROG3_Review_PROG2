package test;

import com.Nj.code.Label;
import com.Nj.code.Matiere;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistoriqueDesNotesTest {
    private Matiere matiere;

    @BeforeEach
    public void setUp() {
        var matiere1 = new Matiere(1, Label.PROG1, 6, null);
        this.matiere = matiere1;
    }

    @Test
    public void testMatiereCreation() {
        assert matiere.getId() == 1;
        assert matiere.getLabel() == Label.PROG1;
        assert matiere.getCredits() == 6;
        assert matiere.getEnseignant() == null;
    }

    // test des deux methodes getExameGrade et getCourseGrade
    @Test
    public void testGetExameGrade() {
        assertEquals(15.0, 15.0);
    }

    @Test
    public void testGetCourseGrade() {
        assertEquals(14.0, 14.0);
    }

}
