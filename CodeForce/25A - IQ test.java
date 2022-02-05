import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 숫자의 개수
        boolean flag = false; // 짝수(true)인지 홀수(false)인지
        int count = 0; // 카운트가 1보다 크면 인덱스 1이 다른 것이다
        int index = -1; // 숫자의 인덱스
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 첫 번째 숫자를 받으면 짝수이면 true, 홀수이면 false를 정해준다.
            if(i == 0) {
                if(num % 2 == 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            }

            // 각 숫자를 받고 해당하는 숫자가 홀로 앞뒤 숫자와 짝수, 홀수가 다르면 카운트를 올리고 인덱스를 저장한다.
            if(flag) {
                if(num % 2 != 0) {
                    count++;
                    index = i + 1;
                }
            } else {
                if(num % 2 == 0) {
                    count++;
                    index = i + 1;
                }
            }
        }

        // 만약 카운트가 2보다 크면 뒤에 있는 것이 다 다른 것이므로 1을 출력한다.
        if(count >= 2) {
            System.out.println(1);
        } else{
            System.out.println(index);
        }
    }
}
