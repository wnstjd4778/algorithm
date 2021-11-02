import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[6];
        for(int i = 1; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++) {
                arr[i] += Integer.parseInt(st.nextToken());
            }
        }
        int index = 0;
        int max = 0;
        for(int i = 1; i <= 5; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(index);
        System.out.println(max);
    }
}
