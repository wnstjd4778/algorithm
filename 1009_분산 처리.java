import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int result = 1;
            for(int i = 0; i < m; i++) {
                result = (result * n) % 10;
            }
            if(result == 0) {
                System.out.println(10);
            } else {
                System.out.println(result);
            }
        }
    }
}
