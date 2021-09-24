import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb= new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);

            switch (now) {
                case  '+':
                case  '*':
                case  '-':
                case  '/':
                    while(!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
                        sb.append(stack.pop());
                    }
                    stack.add(now);
                    break;
                case '(':
                    stack.add(now);
                    break;
                case ')':
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    sb.append(now);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

    public static int priority(char operator) {
        if(operator == '(' || operator == ')') {
            return 0;
        } else if(operator == '+' || operator == '-') {
            return 1;
        } else if(operator == '*' || operator == '/') {
            return 2;
        } else {
            return -1;
        }
    }
}
