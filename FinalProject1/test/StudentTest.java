import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import net.braniumacademy.exception.*;
import net.braniumacademy.model.Student;
import static org.junit.Assert.*;

public class StudentTest {

//Test StudentID có đúng không?
    @Test
    public void testSetStudentIdValid() throws InvalidStudentIdException {
        Student student = new Student();
        String validStudentId = "GCD210340";
        student.setStudentId(validStudentId);
        assertEquals(validStudentId, student.getStudentId());
    }
//Test Student ID sai 
    @Test(expected = InvalidStudentIdException.class)
    public void testSetStudentIdInvalid() throws InvalidStudentIdException {
        Student student = new Student();
        String invalidStudentId = "GCD210-340";
        student.setStudentId(invalidStudentId);
    }
//Test Email Sai
    @Test(expected = InvalidEmailException.class)
    public void testSetEmailInvalid() throws InvalidEmailException {
        Student student = new Student();
        String invalidEmail = "test";
        student.setEmail(invalidEmail);
    }
    //Test Object có Null không?
        @Test
    public void testEqualsWithNullObject() throws InvalidStudentIdException,
            InvalidPersonIdException, InvalidEmailException,
            InvalidPhoneNumberException, InvalidNameException,
            InvalidDateOfBirthException {
        Student student1 = new Student("GCD210340", "GCD1101", "Computer Science", "2021",
                "123456789111", "23 Ngo Quyen", "traquangduy246@gmail.com",
                "0779401475", "Tra Quang Duy", "04/10/2003");
        Student student2 = null;
        assertFalse(student1.equals(student2));
    }
}
