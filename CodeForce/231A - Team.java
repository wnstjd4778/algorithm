import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        int result = 0;
        for(int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            while (st.hasMoreTokens()) {
                if(Integer.parseInt(st.nextToken()) == 1) {
                    count++;
                }
            }
            if(count >= 2) {
                result++;
            }
        }
        System.out.println(result);
    }
}
