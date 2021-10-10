import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        int count = 0;
        boolean[] check = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) == 'P') {
                for(int j = i - m; j <= i + m && j < n; j++) {
                    if(j >= 0) {
                        if (str.charAt(j) == 'H' && !check[j]) {
                            count++;
                            check[j] = true;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}



