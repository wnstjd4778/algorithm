import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       String lowCaseStr = str.toLowerCase();
       String upperCaseStr = str.toUpperCase();

       int count1 = 0;
       int count2 = 0;
       for(int i = 0; i < str.length(); i++) {
           if(lowCaseStr.charAt(i) != str.charAt(i)) {
               count1++;
           }
       }

        for(int i = 0; i < str.length(); i++) {
            if(upperCaseStr.charAt(i) != str.charAt(i)) {
                count2++;
            }
        }
        if(count1 > count2) {
            System.out.println(upperCaseStr);
        } else {
            System.out.println(lowCaseStr);
        }
    }
}
