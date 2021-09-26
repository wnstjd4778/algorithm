import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    static char[] arr;
    static boolean[] check;
    static char[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[m];
        result = new char[m];
        check = new boolean[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            String a = st.nextToken();
            arr[i] = a.charAt(0);
        }
        Arrays.sort(arr);
        dfs(-1, 0);
        System.out.println(sb);
    }
    public static void dfs(int index, int depth) {
        if(depth == n) {
            int count1 = 0;
            int count2 = 0;
            for(int i = 0; i < n; i++) {
                if(result[i] == 'a' || result[i] == 'o' || result[i] == 'i' || result[i] == 'u' || result[i] == 'e') {
                    count1++;
                } else {
                    count2++;
                }
            }
            if(count1 >= 1 && count2 >= 2) {
                for(int i = 0; i < n; i++) {
                    sb.append(result[i]);
                }
                sb.append('\n');
            }
            return;
        }
        for(int i = 0; i < m; i++) {
            if(!check[i] && index < i) {
                check[i] = true;
                result[depth] = arr[i];
                dfs(i, depth + 1);
                check[i] = false;
            }
        }
    }
}
