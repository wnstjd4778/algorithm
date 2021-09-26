import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        BigInteger result1 = new BigInteger("0");
        BigInteger result2 = new BigInteger("0");
        result1 = n.divide(m);
        result2 = n.mod(m);
        System.out.println(result1);
        System.out.println(result2);
    }
}
