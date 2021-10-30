import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
