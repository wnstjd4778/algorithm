import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 8; i >= 0; i--) {
            int num = (int) Math.pow(2,i);
            if(n >= num) {
                n -= num;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
