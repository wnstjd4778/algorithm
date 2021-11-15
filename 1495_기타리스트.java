import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m + 1];
        for(int i = 0; i <= m; i++) {
            arr[i] = -1;
        }
        arr[s] = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            int v = Integer.parseInt(st.nextToken());
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j <= m; j++) {
                if(arr[j] == i - 1) {
                    int res1 = j + v;
                    int res2 = j - v;
                    if(0 <= res1 && res1 <= m) {
                        list.add(res1);
                    }
                    if(0 <= res2 && res2 <= m) {
                        list.add(res2);
                    }
                }
            }
            for(int a : list) {
                arr[a] = i;
            }
        }
        int max = - 1;
        for(int i = 0; i <= m; i++) {
            if(arr[i] == n) {
                max = Math.max(max, i);
            }
        }
        System.out.println(max);
    }
}
