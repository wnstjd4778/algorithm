import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--){
            int num = str.charAt(i) - '0';
            if(str.length() == 1 && num == 0){
                sb.append(0);
                break;
            }  //(c) 공백 문자 출력 방지
            int cnt = 0;
            while(num > 0){
                cnt++;
                sb.append(num % 2);
                num /= 2;
            }

            if(i == 0) break;  //(a)
            sb.append("0".repeat(Math.max(0, 3 - cnt)));  //(b)  //"0"을 0 ~ 3-cnt만큼 반복해준다.

        }
        System.out.println(sb.reverse().toString());
    }
}
