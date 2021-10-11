import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String target = br.readLine();
            System.out.println(solution(input, target));
        }
    }
    static int solution(String input, String target) {
        int count1 = 0;
        int count2 = 0;
        int ans = 0;

        for(int i = 0; i < target.length(); i++) {
            if(input.charAt(i) != target.charAt(i)) {
                if (input.charAt(i) == 'W') {
                    count1++;
                } else {
                    count2++;
                }
            }
        }
        ans += (Math.min(count1, count2) + Math.abs(count1 - count2));
        return ans;
    }
}



