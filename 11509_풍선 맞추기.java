import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            if(arr[input + 1] == 0) {
                ++arr[input];
                ++count;
            } else {
                --arr[input + 1];
                ++arr[input];
            }
        }
        System.out.println(count);
    }
}
