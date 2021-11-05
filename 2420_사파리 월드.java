import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.valueOf(st.nextToken());
        long m = Long.valueOf(st.nextToken());

        long result = n + (m * -1);
        System.out.println(Math.abs(result));
    }
}
