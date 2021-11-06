import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        count[0] = 1 - Integer.parseInt(st.nextToken());
        count[1] = 1 - Integer.parseInt(st.nextToken());
        count[2] = 2 - Integer.parseInt(st.nextToken());
        count[3] = 2 - Integer.parseInt(st.nextToken());
        count[4] = 2 - Integer.parseInt(st.nextToken());
        count[5] = 8 - Integer.parseInt(st.nextToken());
        for(int i = 0; i < 6; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
