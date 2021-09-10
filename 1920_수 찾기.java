import java.io.*;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        arr = new int[size];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(key < arr[mid]) {
                end = mid - 1;
            }
            else if(key > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
