import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();

        int length1 = str1.length;
        int length2 = str2.length;
        int[][] dp = new int[length1 + 1][length2 + 1];
        for(int i = 1; i <= length1; i++) {
            for(int j = 1; j <= length2; j++) {
                if(str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int ans = dp[length1][length2];
        System.out.println(ans);
        int i = length1;
        int j = length2;
        Stack<Character> stack = new Stack<>();
        while (i >= 1 && j >= 1) {
            if(dp[i][j] == dp[i - 1][j]) {
                i--;
            }
            else if(dp[i][j] == dp[i][j - 1]) {
                j--;
            }
            else {
                stack.push(str1[i - 1]);
                i--;
                j--;
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
