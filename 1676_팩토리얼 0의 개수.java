import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static int count, val;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        val = Integer.parseInt(br.readLine());
        while (val >= 5) {
            count += val / 5;
            val /= 5;
        }
        System.out.println(count);
    }
}
