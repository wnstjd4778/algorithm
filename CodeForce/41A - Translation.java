import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str1 = br.readLine();
       String str2 = br.readLine();
       if(str1.length() != str2.length()) {
           System.out.println("NO");
           return;
       }
       for(int i = 0; i < str1.length(); i++) {
           if(str1.charAt(i) != str2.charAt(str1.length() - i - 1)) {
               System.out.println("NO");
               return;
           }
       }
        System.out.println("YES");
    }
}
