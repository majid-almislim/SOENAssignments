package Test;
import TestingProject.Course;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class CourseTest {
    private Course EmptyCourse;
    private Course ValidCourse;
    private Course InvalidCourse;
    @Before
    public void SetupTests(){
        EmptyCourse = new Course(null, 0, null);
        ValidCourse = new Course("Software Testing", 2, "A");
        InvalidCourse = new Course("", 8, "Z");
    }
    @Test
    public void TestCourseConstructorValid(){
        
        //checks if valid course name is correctly passed to object
        assertEquals("Software Testing", ValidCourse.getCourseName());
        
        //checks if valid credit hour value is correctly passed to object
        assertEquals(2, ValidCourse.getCreditHours());
        
        //checks if valid letter grade is passed correctly to object, also tests correct input to isValidGrade Method
        assertEquals("A", ValidCourse.getLetterGrade());
        


    }
    @Test
    public void TestCourseConstructorInvalid(){
        
        //tests if constructor defaults to "Unknown" after invalid input is passed to course name field
        assertEquals("Unknown",InvalidCourse.getCourseName());
        
        //tests if constructor defaults to 3 after invalid credit hour input
        assertEquals(3, InvalidCourse.getCreditHours());

        //tests if constructor defaults to "F" after invalid letter grade input
        assertEquals("F", InvalidCourse.getLetterGrade());
    }
    @Test
    public void TestCourseConstructorNull(){

        //tests constructor's default behavior in null case  of course name
        assertEquals("Unknown", EmptyCourse.getCourseName());
        
        //tests constructor's default behavior in null case of credit hours
        assertEquals(3, EmptyCourse.getCreditHours());

        //tests constructor's default behavior in case of null letter grade
        assertEquals("F", EmptyCourse.getLetterGrade());


    }
    @Test
    public void testGetGradepoint(){
        double delta = 0.01;
        //testing all valid cases
        assertEquals(4.0, ValidCourse.getGradePoint(), delta);
        assertEquals(3.0, new Course("Testing",3,"B").getGradePoint(), delta);
        assertEquals(2.0, new Course("Testing",3,"C").getGradePoint(), delta);
        assertEquals(1.0, new Course("Testing",3,"D").getGradePoint(), delta);

        //testing invalid and null Case
        assertEquals(0.0, InvalidCourse.getGradePoint(), delta);
        assertEquals(0.0, EmptyCourse.getGradePoint(), delta);

    }
}
