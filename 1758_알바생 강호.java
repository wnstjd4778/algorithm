import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long sum = 0;
        for(int i = n - 1, j = 1; i >= 0; i--, j++) {
            int num = arr[i] - (j - 1);
            if(num > 0) {
                sum += num;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}



