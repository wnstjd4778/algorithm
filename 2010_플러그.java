import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(i == 0) {
                sum += num;
            } else {
                sum += (num - 1);
            }
        }
        System.out.println(sum);
    }
}
