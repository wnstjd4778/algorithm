import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

    public static Stack<Character> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());
        for(int i = 0; i < val; i++) {
            String a = br.readLine();
            stack = new Stack<>();
            System.out.println(stack(a));
        }
    }

    public static String stack(String a) {
        for(int j = 0; j < a.length(); j++) {

            // 여는 괄호이면 스택에 넣는다.
            if(a.charAt(j) == '(') {
                stack.push('(');
            }
            // 닫는 괄호인데 스택에 아무것도 없다면 NO를 리턴한다.
            else if(stack.isEmpty()) {
                return "NO";
            }
            // 닫는 괄호면 pop한다.
            else {
                stack.pop();
            }
        }
        // 검사를 하고 stack에 원소가 있으면 NO 없으면 YES를 반환한다.
        if(stack.size() > 0) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
