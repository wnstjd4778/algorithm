import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    static int[] arr;
    static int[] count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[107];
        count = new int[107];
        for(int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            count[num1] = num2;
        }
        bfs();
        System.out.println(arr[100]);

    }
    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        boolean[] check = new boolean[107];
        check[1] = true;
        while (!q.isEmpty()) {
            int num = q.poll();
            if(num == 100) {
                return;
            }
            for(int i = 1; i <= 6; i++) {
                int nowNum = num + i;
                if(nowNum <= 100) {
                    if(count[nowNum] > 0) {
                        nowNum = count[nowNum];
                    }
                    if(!check[nowNum]) {
                        check[nowNum] = true;
                        arr[nowNum] = arr[num] + 1;
                        q.offer(nowNum);
                    }
                }
            }
        }
    }
}
