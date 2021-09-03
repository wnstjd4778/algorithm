// 처음에 StringTokenizer하고 trim함수를 몰라 몇번 틀렸었다.
// trim은 문자열 처음과 끝의 공백의 없애준다
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine().trim();
        // 방법 1
//        if(value.isEmpty()) {
//            System.out.println('0');
//        } else {
//            System.out.println(value.split(" ").length);
//        }
        //방법 2
        StringTokenizer st = new StringTokenizer(value, " ");
        System.out.println(st.countTokens());
    }
}
