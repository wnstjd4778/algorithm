import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] list;
    static boolean[] checked;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        list = new ArrayList[n + 1];
        checked = new boolean[n + 1];
        for(int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        solution();
        System.out.println(result);
    }

    static void solution() {
        Queue<Integer> q = new LinkedList<>();
        checked[1] = true;
        q.add(1);
        int cnt = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int x = q.poll();
                for(int nowX : list[x]) {
                    if(checked[nowX]) {
                        continue;
                    }
                    checked[nowX] = true;
                    result++;
                    q.add(nowX);
                }
            }
            cnt++;
            if(cnt == 2) {
                break;
            }
        }
    }
}
