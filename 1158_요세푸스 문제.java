import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for(int i =1; i <= n; i++) {
            queue.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while (!queue.isEmpty()) {
            for(int i = 0; i < m - 1; i++) {
                queue.offer(queue.poll());
            }
            if(queue.size() == 1) {
                sb.append(queue.poll()).append('>');
            } else {
                sb.append(queue.poll()).append(", ");
            }
        }
        System.out.println(sb);
    }
}
