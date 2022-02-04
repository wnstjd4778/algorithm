import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine().trim());
       int max = 0;
       int passengerCount = 0;
       for(int i = 0; i < n; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           int out = Integer.parseInt(st.nextToken());
           int in = Integer.parseInt(st.nextToken());
           passengerCount -= out;
           passengerCount += in;
           max = Math.max(max, passengerCount);
       }

        System.out.println(max);
    }
}
