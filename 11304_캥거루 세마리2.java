import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if(str == null) {
                return;
            }
            StringTokenizer st = new StringTokenizer(str);
            int[] arr = new int[3];
            for(int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int max = 0;
            for(int i = 1; i < 3; i++) {
                max = Math.max(max, arr[i] - arr[i - 1]);
            }
            System.out.println(max - 1);
        }
    }
}
