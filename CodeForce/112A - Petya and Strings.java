import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().toLowerCase();
        String str2 = br.readLine().toLowerCase();

        for(int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if(c1 > c2) {
                System.out.println(1);
                return;
            }
            if(c2 > c1) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(0);
    }
}
