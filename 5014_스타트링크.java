import java.io.*;
import java.util.*;


public class Main {
    static int f,s,g,u,d;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        arr = new int[f + 1];
        int ans = bfs();
        if(ans == 0) {
            System.out.println("use the stairs");
        }
    }
    static int bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        arr[s] = 1;
        while (!q.isEmpty()) {
            int x = q.poll();
            if(x == g) {
                System.out.println(arr[x] - 1);
                return 1;
            }
            int nx1 = x + u;
            int nx2 = x - d;
            if(nx1 <= f && arr[nx1] == 0) {
                arr[nx1] = arr[x] + 1;
                q.offer(nx1);
            }
            if(nx2 > 0 && arr[nx2] == 0) {
                arr[nx2] = arr[x] + 1;
                q.offer(nx2);
            }
        }
        return 0;
    }
}


