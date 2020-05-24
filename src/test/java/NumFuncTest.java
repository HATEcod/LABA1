import org.junit.Test;

import static org.junit.Assert.*;

public class NumFuncTest {

    @Test
    public void characktersSum() {
        NumFunc numFunc = new NumFunc();
        String st[] = new String[]{"calm", "world"};
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
        String[] inS = new String[]{"HelloWorld", "my", "kate"};
        String[] actual = numFunc.FillArrayWithLess(inS, 2, 5);
        String[] expected = new String[]{"my", "kate"};
        assertArrayEquals(actual, expected);

    }
}