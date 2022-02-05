import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        while (true) {
            n++;
            int num = n;
            int[] arr = new int[10];
            boolean flag = true;
            for(int i = 0; i < 4; i++) {
                arr[num % 10]++;
                if(arr[num % 10] >= 2) {
                    flag = false;
                    break;
                }
                num /= 10;
            }
            if(flag == true) {
                System.out.println(n);
                break;
            }
        }
    }
}
