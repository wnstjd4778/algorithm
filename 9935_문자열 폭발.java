import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String origin = br.readLine();
        String explo = br.readLine();
        Stack<Character> stack = new Stack<>();
        for(int i = origin.length() - 1; i >= 0; i--) {
            stack.push(origin.charAt(i));
            if(stack.size() >= explo.length() && stack.peek() == explo.charAt(0)) {
                boolean flag = true;
                for(int j = 1; j < explo.length(); j++) {
                    if(stack.get(stack.size() - j - 1) != explo.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    for(int j = 0; j < explo.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int size = stack.size();
        if(stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            while (size-- > 0) {
                sb.append(stack.pop());
            }
        }
        System.out.println(sb);
    }
}
