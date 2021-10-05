import java.io.*;
import java.util.*;


public class Main {
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        System.out.println(solution());
    }
    static int solution() {
        if(n == 1) return 1;
        if(n == 2) return Math.min(4, (m + 1) / 2);
        if(m < 7) return Math.min(4, m);
        return m - 2;
    }
}


