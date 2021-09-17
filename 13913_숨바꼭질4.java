import java.io.*;
import java.util.*;

public class Main {
    static class depth {
        int num, depth;
        public depth(int num, int depth) {
            this.depth = depth;
            this.num = num;
        }
    }
    static int n, m;
    static int[] route;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        route = new int[100001];
        check = new boolean[100001];
        Arrays.fill(route, - 1);
        bfs(n);
    }

    public static void bfs(int start) {
        Queue<depth> q = new LinkedList<>();
        q.offer(new depth(start, 0));
        check[start] = true;
        while (!q.isEmpty()) {
            depth num = q.poll();
            if(num.num == m) {
                System.out.println(num.depth);
                print(m);
                System.out.println(sb);
                return;
            }
            if(num.num - 1>= 0 && !check[num.num - 1]) {
                q.offer(new depth(num.num - 1, num.depth + 1));
                check[num.num - 1] = true;
                route[num.num - 1] = num.num;
            }
            if(num.num + 1 <= 100000 && !check[num.num + 1]) {
                q.offer(new depth(num.num + 1, num.depth + 1));
                check[num.num + 1] = true;
                route[num.num + 1] = num.num;
            }
            if(num.num * 2 <= 100000 && !check[num.num * 2]) {
                q.offer(new depth(num.num * 2, num.depth + 1));
                check[num.num * 2] = true;
                route[num.num * 2] = num.num;
            }
        }
    }
    public static void print(int n) {
        if(route[n] > -1) {
            print(route[n]);
        }
        sb.append(n).append(' ');
    }
}
