import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        long sum = 0;
        for(int i = 0; i < str1.length(); i++) {
            int n = str1.charAt(i) - '0';
            for(int j = 0; j < str2.length(); j++) {
                int m = str2.charAt(j) - '0';
                sum += (n * m);
            }
        }
        System.out.println(sum);
    }
}
