import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        BigInteger bigN = BigInteger.ONE;
        BigInteger bigM = BigInteger.ONE;
        for(int i = 0; i < m; i++) {
            bigN = bigN.multiply(new BigInteger(String.valueOf(n - i)));
            bigM = bigM.multiply(new BigInteger(String.valueOf(1 + i)));
        }
        System.out.println(bigN.divide(bigM));
    }
}
