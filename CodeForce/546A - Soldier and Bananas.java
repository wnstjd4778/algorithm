import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int k = Integer.parseInt(st.nextToken());
       int n = Integer.parseInt(st.nextToken());
       int w = Integer.parseInt(st.nextToken());
       int sum = 0;
       for(int i = 1; i <= w; i++) {
           sum += (i * k);
       }
       if(sum > n) {
           System.out.println(sum - n);
       } else {
           System.out.println(0);
       }
    }
}
