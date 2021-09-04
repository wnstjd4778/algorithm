import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[100];
        int[] y = new int[100];
        int[] z = new int[100];
        int i = 0;
        while (true) {
            String value = br.readLine();
            StringTokenizer st = new StringTokenizer(value);
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
            z[i] = Integer.parseInt(st.nextToken());
            if(x[i] == 0 && y[i] == 0 && z[i] == 0) {
                break;
            }
            if(x[i] * x[i] + y[i] * y[i] == z[i] * z[i]) {
                System.out.println("right");
            } else if(x[i] * x[i] + z[i] * z[i] == y[i] * y[i]) {
                System.out.println("right");
            } else if(y[i] * y[i] + z[i] * z[i] == x[i] * x[i]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
