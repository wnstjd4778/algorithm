import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       char[] arr = "hello".toCharArray();
       int count = 0;
       for(int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
           if(c == arr[count]) {
               count++;
           }
           if(count == 5) {
               System.out.println("YES");
               return;
           }
       }
        System.out.println("NO");
    }
}
