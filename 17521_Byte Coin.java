import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < n; i++) {
            int max = 0;
            int min = Integer.MAX_VALUE;
            int maxIndex = 0;
            int minIndex = 0;
            for(int j = i; j < n; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                } else {
                    break;
                }
            }
            for(int j = minIndex; j < n; j++) {
                if(max < arr[j]) {
                    max = arr[j];
                    maxIndex = j;
                } else {
                    break;
                }
            }
            if(min < max) {
                long count = m / min * max;
                count += (m % min);
                i = maxIndex;
                m = count;
            }
        }
        System.out.println(m);
    }
}
