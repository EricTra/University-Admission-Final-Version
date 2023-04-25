/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import net.braniumacademy.model.Subject;
import org.junit.*;
import static org.junit.Assert.*;

public class SubjectTest {
    private Subject subject1, subject2, subject3;

    @Before
    public void setUp() {
        subject1 = new Subject("Math", "Science", 3);
        subject2 = new Subject("Math", "Science", 3);
        subject3 = new Subject("Physics", "Science", 2);
    }

    @Test
   public void testEquals() {
    Subject s1 = new Subject("Math", "Science", 3);
    Subject s2 = new Subject(1, "Math", "Science", 3);
    Subject s3 = new Subject(1, "Math", "Science", 3);
    
    assertFalse(s1.equals(s2));  // IDs are different
    //assertTrue(s2.equals(s3));   // IDs are the same
   
}
    @Test
    public void testToString() {
        String expected1 = "Subject{id=100000, name=Math, kind=Science, numOfLesson=3}";
        String expected3 = "Subject{id=100002, name=Physics, kind=Science, numOfLesson=2}";
        assertEquals(expected1, subject1.toString()); // so sánh expected 1 & subject 1 string
        assertEquals(expected3, subject3.toString()); // so sánh expected 2 & subject 2 string
    }
}
