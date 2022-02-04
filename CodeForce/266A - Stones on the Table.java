import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine().trim());
       String str = br.readLine();
       char now = 'a';
       int result = 0;
       for(int i = 0; i < n; i++) {
           char c = str.charAt(i);
           if(now == c) {
               result++;
           }
           now = c;
       }
        System.out.println(result);
    }
}
