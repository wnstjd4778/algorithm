import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제에서 2번째 문자부터 소문자가 있으면 그대로 출력되는 것을 제대로 해석못하였다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 입력받은 문자열
        char[] ch = str.toCharArray(); // 입력받은 문자열의 배열
        boolean c = true; // 캡스락이 눌렸는지
        for(int i=1; i<ch.length; i++)
            if(Character.isLowerCase(ch[i]))
                c = false;

        if(c == true)
            for(int i=0; i<ch.length; i++)
                if(Character.isUpperCase(ch[i]))
                    ch[i] = Character.toLowerCase(ch[i]);
                else
                    ch[i] = Character.toUpperCase(ch[i]);
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
    }
}
