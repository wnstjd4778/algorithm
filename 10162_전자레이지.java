import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 300;
        int b = 60;
        int c = 10;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        if(n / a > 0) {
            countA += (n / a);
            n = n - ((n / a) * a);
        }
        if(n / b > 0) {
            countB += (n / b);
            n =n - ((n / b) * b);
        }
        countC += (n / c);
        n = n - ((n / c) * c);
        if(n == 0) {
            System.out.println(countA + " " + countB + " " + countC);
        } else {
            System.out.println(-1);
        }
    }
}
