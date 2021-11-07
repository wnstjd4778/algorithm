import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        String str3 = "";
        String str4 = "";
        for(int i = str1.length() - 1; i >= 0; i--) {
            str3 += str1.charAt(i);
        }
        for(int i = str2.length() - 1; i >= 0; i--) {
            str4 += str2.charAt(i);
        }
        int a = Integer.parseInt(str3);
        int b = Integer.parseInt(str4);
        String str5 = String.valueOf((a + b));
        String str6 = "";
        for(int i = str5.length() - 1; i >= 0; i--) {
            str6 += str5.charAt(i);
        }
        System.out.println(Integer.parseInt(str6));

    }
}
