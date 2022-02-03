import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int result = 0;
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '+') {
                    result++;
                    break;
                }
                if(c == '-') {
                    result--;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
