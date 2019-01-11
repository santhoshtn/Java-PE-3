import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class removeVowelCheck {
    removeVowel object;
    @Before
    public void setUp()  {
        object=new removeVowel();
    }

    @After
    public void tearDown()  {
        object=null;
    }

    @Test
    public void test1(){
        String input[]={"India","Australia"};
        String expected[]={"Ind","Astrl"};
        assertArrayEquals(expected,object.vowelRemover(input));
    }
    @Test
    public void test2(){
        String input[]={"!$%^","1234"};
        String expected[]={"!$%^","1234"};
        assertArrayEquals(expected,object.vowelRemover(input));
    }
    @Test
    public void test3(){
        String input[]={"",""};
        String expected[]={"",""};
        assertArrayEquals(expected,object.vowelRemover(input));
    }

}