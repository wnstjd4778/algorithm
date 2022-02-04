import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       int count = 0;
       for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == '4' || str.charAt(i) == '7') {
               count++;
           }
       }
       if(count == 4 || count == 7) {
           System.out.println("YES");
       } else {
           System.out.println("NO");
       }
    }
}
