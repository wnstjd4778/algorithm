import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int indexX = 0;
        int indexY = 0;
        for(int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++) {
                if(Integer.parseInt(st.nextToken()) == 1) {
                    indexX = i;
                    indexY = j;
                }
            }
        }
        int result = Math.abs(2 - indexX) + Math.abs(2 - indexY);
        System.out.println(result);
    }
}
