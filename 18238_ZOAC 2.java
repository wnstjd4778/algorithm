import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char index = 'A';
        int ans = 0;
        for(int i = 0; i < str.length(); i++) {
            char num = str.charAt(i);
            int temp = Math.abs(num - index);
            ans += Math.min(temp, 26 - temp);
            index = num;
        }
        System.out.println(ans);
    }
}

