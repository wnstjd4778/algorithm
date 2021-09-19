import java.io.*;
import java.util.*;


public class Main {

    static int MU = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String in = br.readLine();
        long sum = 0;
        long r = 1;
        for(int i = 0; i < len; i++) {
            sum += (((in.charAt(i) - 'a' + 1) % MU) * r) % MU;
            r = (r * 31) % MU;
        }
        System.out.println(sum % MU);

    }
}
