import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       char now = 'a';
       int max = 0;
       int count = 1;
       for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == now) {
               count++;
           } else {
               max = Math.max(count, max);
               count = 1;
               now = str.charAt(i);
           }
       }
       max = Math.max(count, max);
       if(max >= 7) {
           System.out.println("YES");
       } else {
           System.out.println("NO");
       }
    }
}
