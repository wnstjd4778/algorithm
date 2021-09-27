import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = st.countTokens();
            for(int i = 0; i < m; i++) {
                String val = st.nextToken();
                for(int j = val.length() - 1; j >= 0; j--) {
                    sb.append(val.charAt(j));
                }
                sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
