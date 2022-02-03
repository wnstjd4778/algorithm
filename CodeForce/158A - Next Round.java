import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split(" ");

        int num = Integer.parseInt(arr[k - 1]);
        int result = 0;

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(arr[i]);
            if(a > 0) {
                if(a >= num) {
                    result++;
                } else {
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
