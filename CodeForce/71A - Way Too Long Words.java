import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i = 0; i < tc; i++) {
            String str = br.readLine();
            if(str.length() <= 10) {
                System.out.println(str);
            } else {
                char first = str.charAt(0);
                char end = str.charAt(str.length() - 1);
                String length = String.valueOf(str.length() - 2);
                String result = first + length + end;
                System.out.println(result);
            }
        }
    }
}
