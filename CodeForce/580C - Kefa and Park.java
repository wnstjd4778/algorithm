import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
// 조건
// 고양이가 있는 정점을 최대 m개까지만 갈 수 있다.
// 고양이을 최대 m번까지 마주치고 갈 수 있는 정점의 개수를 구한다.
public class Main {
 
 
    static int n, m, result; // 정점의 개수, 고양이를 최대 마주칠 수 있는 번수, 결과 개수
    static boolean[] check;
    static boolean[] cats;
    static List<List<Integer>> lists = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        check = new boolean[n + 1];
        cats = new boolean[n + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num == 1) {
                cats[i] = true;
            }
        }
        for(int i = 0; i <= n; i++) {
            lists.add(new ArrayList<>());
        }
        for(int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            lists.get(start).add(end);
            lists.get(end).add(start);
        }
        System.out.println(dfs(1, 0));
    }
 
    static int dfs(int cur ,int ret) {
 
        if(cats[cur]) {
            ret++;
        } else {
            ret = 0;
        }
        if(ret > m || check[cur]) {
            return 0;
        }
        check[cur] = true;
        int ans = 0;
        if(cur > 1 && lists.get(cur).size() == 1) {
            return 1;
        }
        for(int next : lists.get(cur)) {
            ans += dfs(next, ret);
        }
        return ans;
    }
}