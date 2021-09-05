import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 666; i < 10000000; i++) {
            for(int j = 0; j < 5; j++) {
                if(i / (int)Math.pow(10,j) % 10 == 6
                        && i / (int)Math.pow(10,j+1) % 10 == 6
                        && i / (int)Math.pow(10,j+2) % 10 == 6) {
                    count++;
                    if(count == val) {
                        System.out.println(i);
                        return;
                    }
                    break; // 만약 6이 연속 4개이상일 시 똑같은 숫자에 count가 2개이상으로 올라가서 오답이 나왔다.
                          // break를 넣어서 연속 6이 3개 for문을 끝냈다.
                }
            }
        }
    }
}
