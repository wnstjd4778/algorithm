import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[n + 1];
        for(int i = 2; i <= n; i++) {
            int num = i * i;
            if(!check[i]) {
                check[i] = true;
                m--;
            }
            if(m == 0) {
                System.out.println(i);
                return;
            }
            for(int j = num; j <= n; j += i) {
                if(!check[j]) {
                    m--;
                    check[j] = true;
                }
                if(m == 0) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
