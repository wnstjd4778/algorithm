import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int[] seq;
    static int[] rdp;
    static int[] ldp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        rdp = new int[n];
        ldp = new int[n];
        seq = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        LIS();
        LDS();
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(max < rdp[i] + ldp[i]) {
                max = rdp[i] + ldp[i];
            }
        }
        System.out.println(max - 1);
    }

    static void LIS() {
        for(int i = 0; i < n; i++) {
            rdp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(seq[j] < seq[i] && rdp[i] < rdp[j] + 1) {
                    rdp[i] = rdp[j] + 1;
                }
            }
        }
    }

    static void LDS() {
        for(int i = n - 1; i >= 0; i--) {
            ldp[i] = 1;
            for(int j = n - 1; j > i; j--) {
                if(seq[j] < seq[i] && ldp[i] < ldp[j] + 1) {
                    ldp[i] = ldp[j] + 1;
                }
            }
        }
    }
}
