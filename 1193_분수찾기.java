import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int size = 1;
        int i = 2;
        int up = 1;
        int down = 1;
        int val = 0;
        while (true) {
            if(size >= a) {
                val = size - a + 1;
                if(i % 2 == 1) {
                    up = i - val;
                    down = val;
                } else {
                    up = val;
                    down = i - val;
                }
                System.out.println(up + "/" + down);
                break;
            }
            sze += i;
            i++;
        }
    }
}
