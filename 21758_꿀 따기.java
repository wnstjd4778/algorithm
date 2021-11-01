import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] ldp = new int[100002];
        int[] rdp = new int[100002];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <= n; i++) {
            ldp[i] = ldp[i - 1] + arr[i];
        }
        for(int i = n; i >= 1; i--) {
            rdp[i] = rdp[i + 1] + arr[i];
        }
        int answer = -1;
        for(int i = 2; i < n; i++) {
            answer = Math.max(answer, (ldp[n] - ldp[1]) + (ldp[n] - ldp[i]) - arr[i]);
        }
        for(int i = n - 1; i >= 2; i--) {
            answer = Math.max(answer, (rdp[1] - rdp[n]) + (rdp[1] - rdp[i]) - arr[i]);
        }
        for(int i = 2; i <= n - 1; i++) {
            answer = Math.max(answer, ldp[i] - arr[1] + rdp[i] - arr[n]);
        }
        System.out.println(answer);
    }
}
