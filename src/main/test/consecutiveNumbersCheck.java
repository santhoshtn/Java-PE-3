import org.junit.Test;

import static org.junit.Assert.*;

public class consecutiveNumbersCheck {
    @Test
    public void test1(){

        consecutiveNumbers a=new consecutiveNumbers();
        String result = a.consecutive("21,22,23");
        assertEquals("21,22,23 are consecutive numbers",result.trim());
    }

    @Test
    public void test2(){

        consecutiveNumbers a=new consecutiveNumbers();
        String result = a.consecutive("21,22,22");
        assertEquals("21,22,22 non consecutive numbers",result.trim());
    }

    @Test
    public void test3(){

        consecutiveNumbers a=new consecutiveNumbers();
        String result = a.consecutive("25,24,23");
        assertEquals("25,24,23 are consecutive numbers",result.trim());
    }

}