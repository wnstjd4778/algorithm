import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[1000001];
        arr[1] = 1;
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            for (int j = i * i; j <= 1000000; j += i) {
                arr[j] = 1;
            }
        }
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                break;
            }
            sb.append(n).append(" = ");
            int count = 0;

            for(int i = 2; i <= n; i++) {
                if(arr[i] == 0 && arr[n - i] == 0) {
                    count++;
                    sb.append(i).append(" + ").append(n - i).append('\n');
                    break;
                }
            }
            if(count == 0) {
                sb.append("Goldbach's conjecture is wrong.").append('\n');
            }
        }
        System.out.println(sb);
    }
}
