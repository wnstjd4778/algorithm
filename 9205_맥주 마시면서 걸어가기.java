import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Node{
        int x,y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int n;
    static List<List<Integer>> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        ArrayList<Node> nodes;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            nodes = new ArrayList<>();
            for(int i = 0; i < n + 2; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                nodes.add(new Node(x, y));
            }

            map = new ArrayList<>();
            for(int i = 0; i < n + 2; i++) {
                map.add(new ArrayList<>());
            }
            for(int i = 0; i < n + 1; i++) {
                for(int j = i + 1; j < n + 2; j++) {
                    int distance = Math.abs(nodes.get(i).x - nodes.get(j).x) + Math.abs(nodes.get(i).y - nodes.get(j).y);
                    if(distance <= 1000) {
                        map.get(i).add(j);
                        map.get(j).add(i);
                    }
                }
            }
            sb.append(bfs()).append("\n");
        }
        System.out.println(sb);
    }

    static String bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean[] visited = new boolean[n + 2];
        visited[0] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            if(cur == n + 1) {
                return "happy";
            }
            for(int i : map.get(cur)) {
                if(visited[i]) {
                    continue;
                }
                visited[i] = true;
                q.add(i);
            }
        }
        return "sad";

    }
}
