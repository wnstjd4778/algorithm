import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                m--;
            }
            if(m == 0) {
                System.out.println(i);
                break;
            }
        }
        if(m > 0) {
            System.out.println(0);
        }
    }
}

