import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        long sum = 0;
        for(int i = 0; i < n; i++) {
            if(i % 3 == 2) continue;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}



