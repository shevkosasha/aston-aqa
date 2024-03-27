import java.io.IOException;

public class Factorial {

    public static int getFactorialOf(int n) throws IOException {
        if ( n < 0) throw new IOException("Factorial of a negative number do not exist");
        if (n < 2) return 1;
        return(n * getFactorialOf(n-1));
    }
}