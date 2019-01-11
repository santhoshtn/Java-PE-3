import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class matrixAdditionCheck {
    matrixAddition object ;
    @Before
    public void setUp()  {
        object=new matrixAddition();
    }

    @After
    public void tearDown()  {
        object=null;
    }
    @Test
    public void addSuccess(){
        int add[][]={
                {10,10},
                {10,10},
                {10,10}
        };
        int arrA[]={1,2,3,4,5,6};
        int row=3,col=2;
        int arrB[]={9,8,7,6,5,4};
        assertArrayEquals(add,object.add(row,col,arrA,arrB));
    }

}