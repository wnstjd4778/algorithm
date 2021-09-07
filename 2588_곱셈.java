import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        int[] result = new int[4];
        for(int i = 2, j = 0; i >= 0; i--, j++) {
            result[j] = ((int) b.charAt(i)-(int)'0') * a;
        }
        result[3] = Integer.parseInt(b) * a;
        for(int i = 0; i < 4; i++) {
            System.out.println(result[i]);
        }
    }
}
