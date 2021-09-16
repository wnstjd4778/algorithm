import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i <size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        int start = 0;
        int end = size - 1;
        int sum = 0;
        while (start < end) {
            sum = arr[start] + arr[end];
            if(sum == x) {
                count++;
            }
            if(sum <= x) {
                start++;
            }
            else {
                end--;
            }
        }
        System.out.println(count);
    }
}
