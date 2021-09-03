import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = 0;
        int count = 0;
        int min = 10000;
        for(int i = c; i <= d; i++) {
            if (i == 2) {
                sum += i;
                min = Math.min(i,min);
                count++;
            } else if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        break;
                    }
                    if (j == i - 1) {
                        min = Math.min(i,min);
                        sum += i;
                        count++;
                    }
                }
            }
        }
        if(count != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}

