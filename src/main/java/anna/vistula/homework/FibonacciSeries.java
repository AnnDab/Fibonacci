package anna.vistula.homework;

public class FibonacciSeries {
    public long getElement(long n){
        if (n <= 1)
            return n;
        return getElement(n-1)+ getElement(n-2);
    }


}
