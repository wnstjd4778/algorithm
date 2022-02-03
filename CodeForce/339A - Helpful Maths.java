import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        int num = 0;
        int[] count = new int[4];
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c != '+') {
                count[c - '0']++;
                num++;
            }
        }
        int numCount = 0;
        for(int i = 0; i < count[1]; i++) {
            numCount++;
            if(numCount != num) {
                result += '1';
                result += '+';
            } else {
                result += '1';
            }
        }

        for(int i = 0; i < count[2]; i++) {
            numCount++;
            if(numCount != num) {
                result += '2';
                result += '+';
            }  else {
                result += '2';
            }
        }

        for(int i = 0; i < count[3]; i++) {
            numCount++;
            if(numCount != num) {
                result += '3';
                result += '+';
            } else {
                result += '3';
            }
        }
        System.out.println(result);
    }
}
