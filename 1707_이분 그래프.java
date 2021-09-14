import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int v, e;
    static List<Integer>[] list;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            list = new ArrayList[v + 1];
            for(int j = 0; j <= v; j++) {
                list[j] = new ArrayList<>();
            }
            visited = new int[v + 1];
            for(int j = 0; j < e; j++) {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                list[first].add(second);
                list[second].add(first);
            }
            bfs();
        }
    }
    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i < v + 1; i++) {
            if(visited[i] == 0) {
                q.offer(i);
                visited[i] = 1;
            }
            while (!q.isEmpty()) {
                int node = q.poll();
                for(int j = 0; j < list[node].size(); j++) {
                    if(visited[list[node].get(j)] == 0) {
                        q.offer(list[node].get(j));
                    }
                    if(visited[list[node].get(j)] == visited[node]) {
                        System.out.println("NO");
                        return;
                    }
                    if(visited[node] == 1 && visited[list[node].get(j)] == 0) {
                        visited[list[node].get(j)] = 2;
                    } else if(visited[node] == 2 && visited[list[node].get(j)] == 0) {
                        visited[list[node].get(j)] = 1;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}
