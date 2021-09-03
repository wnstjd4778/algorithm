import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int max = Math.max(a.length(), b.length());
        int[] aList = new int[max + 1];
        int[] bList = new int[max + 1];
        int[] sum = new int[max + 1];
        for(int i = 0, j = a.length()-1; i < a.length();j--, i++) {
            aList[i] = a.charAt(j) - '0';
        }
        for(int i = 0, j=b.length()-1; i < b.length();j--, i++) {
            bList[i] = b.charAt(j) - '0';
        }
        for(int i = 0; i < max + 1; i++) {
            sum[i] += (aList[i] + bList[i]);
            if(sum[i] >= 10) {
                sum[i+1]++;
                sum[i] -= 10;
            }
        }
        for(int i = max; i >= 0; i--) {
            if(sum[max] == 0 && i == max) {
                continue;
            }
            System.out.print(sum[i]);
        }
    }
}

