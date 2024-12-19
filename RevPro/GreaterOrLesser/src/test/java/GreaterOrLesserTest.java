
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreaterOrLesserTest {
    public Lab gol;
    @Before
    public void setUp(){
        gol = new Lab();
    }

    /**
     * If a is equal to b, gol.decide should return "Equal".
     */
    @Test
    public void greaterOrLesserTest1(){
        int inputA = 0;
        int inputB = 0;
        String expected = "Equal";
        String actual = gol.decide(inputA, inputB);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If a is greater than b, gol.decide should return "Greater".
     */
    @Test
    public void greaterOrLesserTest2(){
        int inputA = 1;
        int inputB = 0;
        String expected = "Greater";
        String actual = gol.decide(inputA, inputB);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If a is less than b, gol.decide should return "Lesser".
     */
    @Test
    public void greaterOrLesserTest3(){
        int inputA = 0;
        int inputB = 1;
        String expected = "Lesser";
        String actual = gol.decide(inputA, inputB);
        Assert.assertEquals(expected, actual);
    }
}
