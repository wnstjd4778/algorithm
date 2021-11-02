import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        boolean flag = false;
        int arr[] = new int[10];
        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            arr[num]++;
            sum += num;
            if(num == 0) {
                flag = true;
            }
        }
        if(!flag || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }
        String ans = "";
        int i = 9;
        while (true) {
            while (arr[i] != 0) {
                ans += i;
                arr[i]--;
            }
            i--;
            if(i == -1) {
                break;
            }
        }
        System.out.println(ans);
    }
}
