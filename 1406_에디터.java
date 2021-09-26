import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < line.length(); i++) {
            stack.push(line.charAt(i));
        }
        int m = Integer.parseInt(br.readLine());
        Stack<Character> dStack = new Stack<>();
        for(int i = 0; i < m; i++) {
            String op = br.readLine();
            char o = op.charAt(0);

            if(o == 'L') {
                if(!stack.isEmpty()) {
                    dStack.push(stack.pop());
                }
            } else if(o == 'D') {
                if(!dStack.isEmpty()) {
                    stack.push(dStack.pop());
                }
            } else if(o == 'B') {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else  {
                stack.push(op.charAt(2));
            }
        }

        while (!dStack.isEmpty()) {
            stack.push(dStack.pop());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }
        System.out.println(sb);
    }
}
