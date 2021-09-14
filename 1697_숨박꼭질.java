import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[] arr;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        arr = new int[100001];
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        bfs();
        System.out.println(arr[m]);
    }
    public static void bfs() {
        q.offer(n);
        while (!q.isEmpty()) {
            int now = q.poll();
            if(now == m) break;
            if(now > 0 && arr[now - 1] == 0) {
                q.offer(now - 1);
                arr[now-1] = arr[now] + 1;
            }
            if(now < 100000 && arr[now + 1] == 0) {
                q.offer(now + 1);
                arr[now + 1] = arr[now] + 1;
            }
            if(now * 2 <= 100000 && arr[now * 2] == 0) {
                q.offer(now * 2);
                arr[now * 2] = arr[now] + 1;
            }
        }
    }
}
