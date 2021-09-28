import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(br.readLine());
        n = n + num / 3600;
        num = num % 3600;
        m += (num / 60);
        num = num % 60;
        r += num;
        if(r >= 60) {
            r -= 60;
            m++;
        }
        if(m >= 60) {
            m -= 60;
            n++;
        }
        System.out.println(n % 24 + " " + m +" " + r);
    }
}
