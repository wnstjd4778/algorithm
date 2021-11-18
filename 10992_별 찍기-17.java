import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            if(i != n) {
                for(int k = 1; k <= 2 * i - 1; k++) {
                    if(k == 1 || k == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for(int k = 0; k < 2 * i - 1; k++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
