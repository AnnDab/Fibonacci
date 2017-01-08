package anna.vistula.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciSeriesTest {
    @Test
    public void fibonacciResult(){
        FibonacciSeries fibonacci = new FibonacciSeries();
       assertEquals("getElement(0)", 0, fibonacci.getElement(0));
       assertEquals("getElement(1)",1, fibonacci.getElement(1));
       assertEquals("getElement(2)",1,fibonacci.getElement(2));
       assertEquals("getElement(6)", 8,fibonacci.getElement(6));

    }

}
