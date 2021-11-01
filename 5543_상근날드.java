import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++) {
            min = Math.min(min, Integer.parseInt(br.readLine()));
        }
        sum += min;
        min = Integer.MAX_VALUE;
        for(int i = 0; i < 2; i++) {
            min = Math.min(min, Integer.parseInt(br.readLine()));
        }
        sum += min;
        System.out.println(sum - 50);
    }
}
