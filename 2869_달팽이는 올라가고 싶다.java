import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        StringTokenizer st = new StringTokenizer(read);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int val = 0;
            if((c-a) % (a-b) > 0) {
                val = ((c - a) / (a - b))+1;
            } else {
                val = (c - a) / (a - b);
            }
        System.out.println(val + 1);
    }
}
