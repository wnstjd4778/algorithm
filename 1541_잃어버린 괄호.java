import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer val1 = new StringTokenizer(br.readLine(), "-"); // 입력받은 문자열을 우선 -로 나눔
        int sum = Integer.MAX_VALUE;
        while (val1.hasMoreElements()) {
            int temp = 0;
            StringTokenizer val2 = new StringTokenizer(val1.nextToken(), "+"); // val1을 +로 나눔
            while (val2.hasMoreElements()) {
                temp += Integer.parseInt(val2.nextToken());
            }
            if(sum == Integer.MAX_VALUE) { // 처음값은 무조건 +이고 -가 없을 경우
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
