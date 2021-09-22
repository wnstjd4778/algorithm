import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        for(int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            int start = x;
            boolean flag = false;
            while (start < n * m) {
                if(flag = (start % m == y)) {
                    System.out.println(start + 1);
                    break;
                }
                start += n;
            }
            if(!flag) {
                System.out.println(-1);
            }
        }
    }
}
