import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 1;
        int[] check = new int[123456 * 2];
        while (a != 0) {
            int count = 0;
            a = Integer.parseInt(br.readLine());
            if(a == 1) {
                System.out.println(1);
                continue;
            }
            for(int i = 2; i < Math.sqrt(2 * a); i++) {
                int b = i*i;
                    for (int j = b; j < 2 * a; j += i) {
                        check[j] = 1;
                    }
            }
            for(int i = a + 1; i < a * 2; i++) {
                if(check[i] == 0) {
                    count++;
                }
            }
            if(a != 0) {
                System.out.println(count);
            }
        }
    }
}
