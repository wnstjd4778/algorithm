import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int val = Integer.parseInt(br.readLine());
        for(int i = 0; i < val; i++) {
            int num = Integer.parseInt(br.readLine()); // 입력값이 0이면 pop함
            if(num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int sum = 0;
        for(int i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}
