import org.junit.Test;

import static org.junit.Assert.*;

public class firstAndLastDateCheck {


    @Test
    public void test1() {
        firstAndLastDate a = new firstAndLastDate();
        String result = a.firstLastDate();
        assertEquals("Mon 07/01/2019 Sun 13/01/2019",result);
    }

}