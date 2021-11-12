import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[n + 1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        int[] indegree = new int[n + 1];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            indegree[b]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 1; i <= n; i++) {
            if(indegree[i] == 0) {
                pq.offer(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            int now = pq.poll();
            sb.append(now + " ");
            for(int next : list.get(now)) {
                indegree[next]--;
                if(indegree[next] == 0) {
                    pq.offer(next);
                }
            }
        }
        System.out.println(sb);
    }
}
