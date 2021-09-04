import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        int[] y = new int[3];
        int resultX = 0;
        int resultY = 0;
        for (int i = 0; i < 3; i++) {
            String value = br.readLine();
            StringTokenizer st = new StringTokenizer(value);
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (x[i] == x[j]) {
                    x[i] = 0;
                    x[j] = 0;
                    break;
                }
            }
            for (int j = i + 1; j < 3; j++) {
                if (y[i] == y[j]) {
                    y[i] = 0;
                    y[j] = 0;
                    break;
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            if(x[i] != 0) {
                resultX = x[i];
            }
            if(y[i] != 0) {
                resultY = y[i];
            }
        }
        System.out.println(resultX+ " "+ resultY);
    }
}
