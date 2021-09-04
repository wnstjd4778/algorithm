import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder(); // 시간초과가 나와서 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = (int) Math.pow(2, n) - 1;
        sb.append(result).append('\n');
        hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    public static void hanoi(int n, int start, int mid, int to) {
        if(n == 1) {
            sb.append(start).append(' ').append(to).append('\n'); // 처음에 시작블럭에서 목적지블럭으로 이동
        } else {
            hanoi(n-1, start, to, mid);
            sb.append(start).append(' ').append(to).append('\n'); // 마지막 한개의 블록을 목적지블럭으로 이동
            hanoi(n-1, mid, start, to); // 중간블럭을 목적지블럭으로 이동
        }
    }
}
