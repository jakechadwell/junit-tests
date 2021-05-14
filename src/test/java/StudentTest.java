import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student1;

    @Before public void createStudents(){
        student1 = new Student(000001, "Jake");
    }

    @Test public void ifStudentCreated(){
        assertNotNull(student1);
    }

    @Test public void testIfIdEquals(){
        assertEquals(000001, student1.getId(), 0);
    }

    @Test public void testIfNameEquals(){
        assertEquals("Jake", student1.getName());
    }

    @Test public void testGradesExist(){
        assertNotNull(student1.getGrades());
    }

    @Test public void testIfGradesAdd(){
        student1.addGrade(90);
        assertEquals(1, student1.getGrades().size(), 0);
    }

    @Test public void testIfGradesAverage(){
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(85);
        assertEquals(85, student1.getGradeAverage(), 0);
    }
}
