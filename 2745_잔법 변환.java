import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int ans = 0;
        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if(num >= 10) {
                num -= 7;
            }
            ans += (num * Math.pow(n, str.length() - 1 - i));
        }
        System.out.println(ans);
    }
}
