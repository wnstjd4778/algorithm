import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] arr;
    static int[] result;
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
        dfs("", 0,  0);
    }

    static void dfs(String val, int num, int depth) {
        if(depth == m) {
            if(!set.contains(val)) {
                set.add(val);
                System.out.println(val);
            }
            return;
        }
        for(int i = num; i < n; i++) {
            dfs(val + arr[i] + " ", i, depth + 1);
        }
    }
}
