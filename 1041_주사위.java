import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int arr[] = new int[6];
        long ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0;
        long max = 0;
        for(int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            max = Math.max(arr[i], max);
        }
        int one = 5000;
        int two = 5000;
        int three = 5000;
        for(int i = 0; i < 6; i++) {
            one = Math.min(one, arr[i]);
            for(int j = i + 1; j < 6; j++) {
                if(i + j == 5) continue;
                two = Math.min(arr[i] + arr[j], two);
                for(int k = j + 1; k < 6; k++) {
                    if(i + k == 5 || j + k == 5) continue;
                    three = Math.min(three, arr[i] + arr[j] + arr[k]);
                }
            }
        }
        if(n == 1) {
            ans = sum - max;
        } else {
            ans = (4 * three) + ((8 * n - 12) * two) + (5 * n - 6) * (n - 2) * one;
        }

        System.out.println(ans);
    }
}


