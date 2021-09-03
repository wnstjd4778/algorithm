import java.util.Scanner;
import java.util.StringTokenizer;
// 처음에 String을 split로 나누어 count를 사용해 단어의 개수를 구한 다음 계산을 했는데 오답이 나왔다. 이유는 split는 만약 "happy"일 때
// split(p)를 사용하면 "ha", "", "y"가 나와 3개로 분리가 된다. 공백으로 나온것을 없애기 위해 StringTokenizer을 사용했다. 
// StringTokenizer는 split와 같은 역할을 하지만 위와 같은 happy를 token화하면 "ha", "y"가 된다. StringTokenzier는 공백을 표시하지 않는다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] value = new String[a];
        int size = 0;
        int sum = 0;
        int[] result = new int[a];
        for (int i = 0; i < a; i++) {
            value[i] = "1" + sc.next() + "1" ;
        }
        for(int i = 0; i < a; i++) {
            for (char j = 'a'; j <= 'z'; j++) {
                size = new StringTokenizer(value[i], String.valueOf(j)).countTokens(); // 입력한 단어를 a-z로 나누어 토큰을 만든다.
                if(size >= 3) {
                    result[i]++; // token의 개수가 3개이상이면 영어가 연속된 단어가 아니다.
                }
            }
            if(result[i] == 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
