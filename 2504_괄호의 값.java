import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<String> stack = new Stack<>();
        boolean isAble = true;
        for(int i = 0; i < str.length(); i++) {
            String val = String.valueOf(str.charAt(i));
            if(val.equals("(")) {
                stack.push(")");
                continue;
            }
            if(val.equals("[")) {
                stack.push("]");
                continue;
            }

            int num = 0;
            while (true) {
                if(stack.isEmpty()) {
                    isAble = false;
                    break;
                }
                if(isNumber(stack.peek())) {
                    num += Integer.parseInt(stack.pop());
                } else {
                    if(isVPS(val, stack.peek())) {
                        stack.pop();
                        int t = (")".equals(val) ? 2 : 3);
                        if(num == 0) {
                            stack.push(String.valueOf(t));
                        } else {
                            stack.push(String.valueOf(t * num));
                        }
                        break;
                    } else {
                        isAble = false;
                        break;
                    }
                }
            }
            if(!isAble) {
                break;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            if(isNumber(stack.peek())) {
                result += Integer.parseInt(stack.pop());
            } else {
                isAble = false;
                break;
            }
        }
        if(isAble) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }

    static boolean isVPS(String c, String target) {
        if(c.equals(target)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isNumber(String str) {
        if(str.equals(")") || str.equals("]")) {
            return false;
        } else {
            return true;
        }
    }
}
