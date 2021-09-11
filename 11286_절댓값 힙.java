import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 절대값 비교
        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) ->{
            if(Math.abs(a) == Math.abs(b)) {
                return a>b?1:-1;
            }
            return Math.abs(a)-Math.abs(b);
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) {
                sb.append(que.size() == 0 ? 0 : que.poll()).append('\n');
            } else {
                que.offer(num);
            }
        }
        System.out.println(sb);
    }
}
