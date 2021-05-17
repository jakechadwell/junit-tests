import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CohortTest {
    Cohort marco;
    Cohort bash;

    @Before
    public void setup() {
        marco = new Cohort();
        bash = null;
        Student jake = new Student(1L, "Jake");
        marco.addStudent(jake);
        jake.addGrade(90);
        jake.addGrade(95);
        jake.addGrade(100);
        Student kel = new Student(1L, "Kel");
        marco.addStudent(kel);
        kel.addGrade(80);
        kel.addGrade(70);
        kel.addGrade(100);
    }

    @Test
    public void testCreationOfCohort() {
        assertNotNull(marco);
        assertNull(bash);
    }

    @Test
    public void testAddStudents() {
        assertEquals(1, marco.getStudents().size());
    }

    @Test
    public void testGetStudents() {
        assertEquals(2, marco.getStudents().size());
    }

    @Test
    public void testGetCohortAverage() {
        assertEquals(90, marco.getCohortAverage(), 1);
    }
}
