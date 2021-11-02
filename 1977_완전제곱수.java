import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean flag  = false;
        int sum = 0;
        int min = 0;
        for(int i = m; i <= n; i++) {
            double num = Math.sqrt(i);
            if(num == (int)num) {
                if(!flag) {
                    min = i;
                }
                flag = true;
                sum += i;
            }
        }
        if(!flag) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
