import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double value = Double.parseDouble(br.readLine());
        double result1 = value*value*Math.PI;
        double result2 = value*value*2.000000;

        System.out.println(result1);
        System.out.println(result2);
    }
}
