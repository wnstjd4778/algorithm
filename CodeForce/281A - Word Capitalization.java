import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            String c = String.valueOf(str.charAt(i));
            if(i == 0) {
                result += c.toUpperCase();
            } else {
                result += c;
            }
        }
        System.out.println(result);
    }
}
