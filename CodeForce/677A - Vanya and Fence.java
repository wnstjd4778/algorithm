import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 사람의 숫자
        int h = Integer.parseInt(st.nextToken()); // 제한되는 키의 값
        int result = 0; // 도로의 최소 너비
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken()); // 각 사람의 키의 값

            // 키의 값이 제한되는 키의 값을 넘으면 도로의 너비를 2를 추가하고 아니면 1을 추가한다.
            if(num > h) {
                result += 2;
            } else {
                result++;
            }
        }
        System.out.println(result);
    }
}
