import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 입력받은 문자열

        // 해당 문자가 들어있으면 YES를 출력하고 안 들어있으면 NO를 출력한다.
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'H' || c == 'Q' || c == '9') {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
