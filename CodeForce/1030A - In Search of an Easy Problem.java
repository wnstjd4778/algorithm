import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim()); // 입력받은 사람의 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken()); // 각 사람의 투표 결과
            
            // 한개라도 1이면 HARD를 출력
            if(num == 1) {
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
