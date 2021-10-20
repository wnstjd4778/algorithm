import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            int count = 0;
            int differentCount = 0;
            int zeroCount1 = 0;
            int zeroCount2 = 0;
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) == '0') {
                    zeroCount1++;
                }
                if(str2.charAt(i) == '0') {
                    zeroCount2++;
                }
            }
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) != str2.charAt(i)) {
                    differentCount++;
                }
            }
            System.out.println((differentCount - Math.abs(zeroCount1 - zeroCount2)) / 2 + Math.abs(zeroCount1 - zeroCount2));
        }
    }
}
