import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[4];
        arr[1] = true;
        arr[2] = false;
        arr[3] = false;
        boolean test = false;
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            test = arr[a];
            arr[a] = arr[b];
            arr[b] = test;
        }
        for(int i = 1; i <= 3; i++) {
            if(arr[i]) {
                System.out.println(i);
            }
        }
    }
}
