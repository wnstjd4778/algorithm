import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int[] makeArr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int l = n - 1;
            int r = 1;
            makeArr[0] = arr[0];
            for(int j = 1; j < n; j++) {
                if(j % 2 == 1) {
                    makeArr[l--] = arr[j];
                } else {
                    makeArr[r++] = arr[j];
                }
            }
            int ans = Math.abs(makeArr[0] - makeArr[n - 1]);
            for(int j = 1; j < n; j++) {
                ans = Math.max(ans, Math.abs(makeArr[j] - makeArr[j - 1]));
            }
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }
}


