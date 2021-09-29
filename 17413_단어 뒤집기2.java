import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        boolean inout = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '<') {
                inout = true;
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(s.charAt(i));
            }
            else if(s.charAt(i) == '>') {
                inout = false;
                System.out.print(s.charAt(i));
            }
            else if(inout) {
                System.out.print(s.charAt(i));
            }
            else  if(!inout) {
                if(s.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(s.charAt(i));
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
