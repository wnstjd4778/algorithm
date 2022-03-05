import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
// 조건
// AB 나 BA가 문자열에 포함되면 YES 아니면 NO를 출력한다.(중복 X)
//
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0; // AB가 나왔는지, BA가 나왔는지, 중복이 됬는지
        for(int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
 
            if(flag1 == 0) {
                if(c == 'A') {
                    if(str.charAt(i + 1) == 'B') {
                        flag1 = 1;
                        i++;
                    }
                }
            }
            if(flag1 == 1) {
                if(c == 'B') {
                    if(str.charAt(i + 1) == 'A') {
                        flag2=1;
                        i++;
                    }
                }
            }
        }
        for(int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if(flag3 == 0) {
                if(c == 'B') {
                    if(str.charAt(i + 1) == 'A') {
                        flag3 = 1;
                        i++;
                    }
                }
            }
            if(flag3 == 1) {
                if(c == 'A') {
                    if(str.charAt(i + 1) == 'B') {
                        flag4 = 1;
                        i++;
                    }
                }
            }
        }
        if((flag3 == 1 && flag4 == 1) || (flag1 == 1 && flag2 == 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}