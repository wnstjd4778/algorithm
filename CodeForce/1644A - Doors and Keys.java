import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
// 조건
// 6개의 문자가 주어진다.문자는  소문자면 키 대문자면 문을 가리킨다. 해당 문자가 주얼질 때 순서대로 모든 문을 열수 있는지 구한다.
//
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while(tc-- > 0) {
            String str = br.readLine();
            ArrayList<Integer> list = new ArrayList<>();
            boolean flag = true;
            for(int i = 0; i < 6; i++) {
                char c = str.charAt(i);
                if(c == 'r' || c == 'g' || c == 'b') {
                    list.add(c - 32);
                }
                if(c == 'R' || c == 'G' || c == 'B') {
                    if(list.indexOf((int)c) == -1) {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                }
            }
            if(flag)
            System.out.println("YES");
        }
    }
}