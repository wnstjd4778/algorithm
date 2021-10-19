import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        int target = n;
        int count = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] == target) {
                count++;
                target--;
            }
        }
        System.out.println(n - count);
    }
}
