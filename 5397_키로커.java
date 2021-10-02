import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();
            String input = br.readLine();
            for(int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                switch (ch) {
                    case '<':
                        if(!left.isEmpty()) {
                            right.push(left.pop());
                        }
                        break;
                    case '>':
                        if(!right.isEmpty()) {
                            left.push(right.pop());
                        }
                        break;
                    case '-':
                        if(!left.isEmpty()) {
                            left.pop();
                        }
                        break;
                    default:
                        left.push(ch);
                }
            }
            for(Character ch : left) {
                sb.append(ch);
            }
            while (!right.isEmpty()) {
                sb.append(right.pop());
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}

