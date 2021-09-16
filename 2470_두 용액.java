import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        long sum = 0;
        int index1 = 0;
        int index2 = 0;
        long min = Integer.MAX_VALUE;
        while (start < end) {
            sum = arr[start] + arr[end];
            if(Math.abs(sum) < Math.abs(min)) {
                min = sum;
                index1 = start;
                index2 = end;
            }
            if(sum > 0) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(arr[index1] + " " + arr[index2]);
    }
}
