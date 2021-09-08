import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

    public static Stack<Character> stack1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String a = br.readLine();
            stack1 = new Stack<>();
            if(a.equals(".")) {
                break;
            }
            System.out.println(stack(a));
        }
    }

    public static String stack(String a) {
        for(int j = 0; j < a.length(); j++) {

            // (이면 스택에 넣는다.
            if(a.charAt(j) == '(') {
                stack1.push('(');
            }
            // )인데 스택이 비어있거나 pop했는데 (가 아니라면 no를 리턴한다.
            else if(a.charAt(j) == ')'){
                if(stack1.isEmpty()) {
                    return "no";
                }
                if(stack1.pop() != '(') {
                    return "no";
                }
            }
            // [이면 스택에 넣는다.
            else if(a.charAt(j) == '[') {
                stack1.push('[');
            }
            // ]인데 스택이 비어있거나 pop했는데 [가 아니라면 no를 리턴한다.
            else if(a.charAt(j) == ']') {
                if(stack1.isEmpty()) {
                    return "no";
                }
                if(stack1.pop() != '[') {
                    return "no";
                }
            }
        }
        // 검사를 하고 stack이 비어있으면 yes, 비어있지 않으면 no를 반환한다.
        if(stack1.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
