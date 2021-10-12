import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String m = st.nextToken();
        int count = 0;
        if(n.length() == m.length()) {
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == '8' && m.charAt(i) == '8') {
                    count++;
                } else if(n.charAt(i) != m.charAt(i)) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
