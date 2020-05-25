import org.junit.Test;

import static org.junit.Assert.*;

public class NumFuncTest {

    @Test
    public void characktersSum() {
        NumFunc numFunc = new NumFunc();
        String st[] = new String[]{"day", "world"};
        int actual = numFunc.CharacktersSum(st);
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    public void middle() {
        NumFunc numFunc = new NumFunc();
        int actual = numFunc.Middle(66, 8);
        int expective = 8;
        assertEquals(actual,expective);
    }
    @Test
    public void fillArrayWithLess(){
        NumFunc numFunc = new NumFunc();
        String[] inS = new String[]{"wtf", "bmw", "hello"};
        String[] actual = numFunc.FillArrayWithLess(inS, 2, 5);
        String[] expected = new String[]{"bmw", "hello"};
        assertArrayEquals(actual, expected);

    }
}