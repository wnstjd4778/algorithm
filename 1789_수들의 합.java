import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int i = 1;
        while (n >= 0) {
            n -= i;
            i++;
        }
        System.out.println(i - 2);
    }
}
