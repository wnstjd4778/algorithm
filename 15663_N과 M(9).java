import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static int[] result;
    static boolean[] check;
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        result = new int[n];
        Arrays.sort(arr);
        check = new boolean[n];
        dfs("", 0);
    }

    static void dfs(String val, int depth) {
        if(depth == m) {
            if(!set.contains(val)) {
                set.add(val);
                System.out.println(val);
            }
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                check[i] = true;
                dfs(val + arr[i] + " ", depth + 1);
                check[i] = false;
            }
        }
    }
}
