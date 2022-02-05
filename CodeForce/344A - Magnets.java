import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim()); // 자석의 개수
        int result = 1; // 자석 그룹의 개수
        char now = '3'; // 현재 끝의 자석의 극


        for(int i = 0; i < n; i++) {
            String str = br.readLine(); // 각 자석의 극

            // 첫번째 극이 now의 극과 같으면 그룹수를 올려준다.
            if(str.charAt(0) == now) {
                result++;
            }
            now = str.charAt(1);
        }

        System.out.println(result);
    }
}
