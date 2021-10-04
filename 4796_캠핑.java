import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) {
                break;
            }
            int count = c / b * a;
            if(c % b > a) {
                count += a;
            } else {
                count += (c % b);
            }
            sb.append("Case ").append(test).append(": ").append(count).append('\n');
            test++;
        }
        System.out.println(sb);
    }
}


