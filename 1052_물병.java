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

        int count = 0;

        while (true) {
            int fullBottle = 0;
            int bottle = n;

            while (true) {
                if(bottle % 2 == 1) {
                    fullBottle++;
                }
                bottle /= 2;
                if(bottle == 0) {
                    break;
                }
            }
            if(fullBottle <= m) {
                break;
            }
            n++;
            count++;
        }

        System.out.println(count);
    }
}
