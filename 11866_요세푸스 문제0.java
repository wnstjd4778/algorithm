import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Deque<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        for(int i = 1; i < n + 1; i++) {
            q.offer(i);
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++) {
                q.offer(q.poll());
            }
            if(i == n-1) {
                sb.append(q.poll()).append('>');
            } else {
                sb.append(q.poll()).append(',').append(' ');
            }
        }
        System.out.println(sb);
    }
}
