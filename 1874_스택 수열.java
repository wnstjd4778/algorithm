import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        for(int i = 0; i < size; i++) {
            int val = Integer.parseInt(br.readLine());
            if(val > start) {
                // start + 1부터 val까지 push한다.
                for(int j = start + 1; j <= val; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = val; // 오름차순을 위해 변수 초기화
            }
            // top에 있는 원소가 입력받은 값과 다른 경우
            else if(stack.peek() != val) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}
