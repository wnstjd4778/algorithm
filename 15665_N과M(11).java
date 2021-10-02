import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    static ArrayList<Integer> list;
    static int[] result;
    static boolean[] check = new boolean[10001];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        result = new int[m];
        list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean flag = false;
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j) == num) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                list.add(Integer.valueOf(num));
            }
        }
        Collections.sort(list);
        dfs(0);
        System.out.println(sb);
    }
    static void dfs(int depth) {
        if(depth == m) {
            for(int num : result) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int val : list) {
            if(!check[val]) {
                result[depth] = val;
                dfs(depth + 1);
            }
        }
    }
}

