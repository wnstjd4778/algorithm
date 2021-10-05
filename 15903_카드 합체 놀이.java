import java.io.*;
import java.util.*;


public class Main {
    static PriorityQueue<Long> q;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        q = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            q.offer(Long.valueOf((st.nextToken())));
        }
        for(int i = 0; i < m; i++) {
            long a = q.poll();
            long b = q.poll();
            q.offer(a + b);
            q.offer(a + b);
        }
        long sum = 0;
        while (!q.isEmpty()) {
            sum += q.poll();
        }
        System.out.println(sum);
    }
}


