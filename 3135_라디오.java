import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int min = Math.abs(n - m);
        for(int i = 0; i < size; i++) {
            int dist = Math.abs(arr[i] - m);
            if(min > dist) {
                min = dist;
            }
        }
        if(min == Math.abs(n - m)) {
            System.out.println(min);
        } else {
            System.out.println(min + 1);
        }
    }
}

