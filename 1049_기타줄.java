import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int minAll = Integer.MAX_VALUE;
        int minOne = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a < minAll) {
                minAll = a;
            }
            if(b < minOne) {
                minOne = b;
            }
        }
        if(minAll > minOne * 6) {
            System.out.println(minOne * n);
        }
        else {
            int result = n / 6 * minAll;
            if(n % 6 > 0 && n % 6 * minOne > minAll) {
                result += minAll;
            } else {
                result += (n % 6 * minOne);
            }
            System.out.println(result);
        }

    }
}
