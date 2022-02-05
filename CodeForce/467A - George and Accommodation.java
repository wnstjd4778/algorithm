import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim()); // 방의 개수
        int result = 0; // George와 Alex가 들어갈 수 있는 방의 수
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nowCount = Integer.parseInt(st.nextToken()); // 각 방의 현재 인원 수
            int maxCount = Integer.parseInt(st.nextToken()); // 각 방의 최대 인원 수
            int leftCount = maxCount - nowCount; // 남은 빈자리의 수

            // 2명이상의 빈자리가 있으면 result를 추가한다
            if(leftCount >= 2) {
                result++;
            }
        }

        System.out.println(result);
    }
}
