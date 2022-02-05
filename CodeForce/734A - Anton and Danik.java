import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine().trim());
       String str = br.readLine();
       int count1 = 0;
       int count2 = 0;
       for(int i = 0; i < n; i++) {
           char c = str.charAt(i);
           if(c == 'A') {
               count1++;
           } else {
               count2++;
           }
       }
       if(count1 > count2) {
           System.out.println("Anton");
       } else if(count2 > count1) {
           System.out.println("Danik");
       } else {
           System.out.println("Friendship");
       }
    }
}
