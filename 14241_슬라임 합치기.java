import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            q.offer(Integer.valueOf(st.nextToken()));
        }
        int ans = 0;

        while (q.size() >= 2) {
            int a = q.poll();
            int b = q.poll();
            ans += a * b;
            q.offer(a + b);
        }
        System.out.println(ans);
    }
}
