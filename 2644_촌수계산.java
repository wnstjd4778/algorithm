import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] ad;
    static boolean[] visit = new boolean[101];
    static int nV, nE;
    static int n, m;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        nV = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        nE = Integer.parseInt(st.nextToken());

        ad = new ArrayList[nV + 1];
        for(int i = 1; i <= nV; i++) {
            ad[i] = new ArrayList<>();
        }
        for(int i = 0; i < nE; i++) {
            st = new StringTokenizer(br.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            ad[t1].add(t2);
            ad[t2].add(t1);
        }
        dfs(n, 0);
        System.out.println(result);
    }

    static void dfs(int start, int cnt) {
        visit[start] = true;
        for(int index : ad[start]) {
            if(!visit[index]) {
                if(index == m) {
                    result = cnt + 1;
                    return;
                }
                dfs(index, cnt + 1);
            }
        }
    }
}
