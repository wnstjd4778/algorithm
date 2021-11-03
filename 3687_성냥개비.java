import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] minDp = new long[101];
            Arrays.fill(minDp, Long.MAX_VALUE);
            minDp[2] = 1;
            minDp[3] = 7;
            minDp[4] = 4;
            minDp[5] = 2;
            minDp[6] = 6;
            minDp[7] = 8;
            minDp[8] = 10;
            int[] arr = {1, 7, 4, 2, 0, 8};
            for(int i = 9; i <= 100; i++) {
                for(int j = 2; j <= 7; j++) {
                    String line = "" + minDp[i - j] + arr[j - 2];
                    minDp[i] = Math.min(minDp[i], Long.parseLong(line));
                }
            }
            StringBuilder max = new StringBuilder();
            long a = n / 2;
            long b = n % 2;
            if(b == 1) {
                max.append(7);
            } else {
                max.append(1);
            }
            for(int i = 1; i < a; i++) {
                max.append(1);
            }
            System.out.println(minDp[n] + " " + max.toString());
        }
    }
}
