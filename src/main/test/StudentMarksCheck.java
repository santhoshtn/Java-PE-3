import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class StudentMarksCheck {
    StudentMarks object;
    private  ByteArrayInputStream inputStream;



    @Before
    public void setUp()  {
        object=new StudentMarks();
    }

    @After
    public void tearDown() throws IOException {
        inputStream.close();
    }

    @Test
    public void  testSuccess(){
        String INPUT = "4 11 12 13 14";
        inputStream = new ByteArrayInputStream(INPUT.getBytes());
        System.setIn(inputStream);
        assertEquals("Success",object.student());
    }
    @Test
    public void  testFailure(){
        String INPUT = "4 11 120 13 14";
        inputStream = new ByteArrayInputStream(INPUT.getBytes());
        System.setIn(inputStream);

        assertEquals("Failure",object.student());
    }

}