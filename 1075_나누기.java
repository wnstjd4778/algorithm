import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int ans = 0;
        n = n -(n % 100);
        for(int i = 0; i <= 99; i++) {
            int sum = n + i;
            if(sum % m == 0) {
                ans = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(ans < 10) {
            sb.append('0').append(ans);
        } else {
            sb.append(ans);
        }
        System.out.println(sb);
    }
}


