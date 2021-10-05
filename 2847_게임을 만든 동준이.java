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
        int count = 0;
        int max = arr[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            if(max > arr[i]) {
                max = arr[i];
            } else {
                count += (arr[i] - max + 1);
                max--;
            }
        }
        System.out.println(count);
    }
}


