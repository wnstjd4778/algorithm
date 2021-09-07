import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] num = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();
        for(int i = 0; i < size; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i < size; i++) {
            int val = gcd(num[0], num[i]);
            sb.append(num[0] / val).append("/").append(num[i] / val).append('\n'); // 약분을 함
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b) { // 유클리드 호제법
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
