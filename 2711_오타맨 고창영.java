import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String ans = "";
            for(int i = 0; i < str.length(); i++) {
                if(i == n - 1) {
                    continue;
                }
                ans += str.charAt(i);
            }
            System.out.println(ans);
        }
    }
}
