import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1 || n == 3) {
            System.out.println(-1);
            return;
        }
        int count = n / 5;
        n = n - (n / 5 * 5);
        if(n % 2 == 1) {
            count--;
            count += (n + 5) / 2;
        } else {
            count += n / 2;
        }
        System.out.println(count);
    }
}


