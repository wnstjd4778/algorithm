import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[43];
        int size = 0;
        for(int i = 0; i < 10; i++) {
            a[i] = sc.nextInt() % 42;
        }
        for(int i = 0; i < 10; i++) {
            b[a[i]]++;
            }

        for(int i = 0; i < 42; i++) {
            if(b[i] >= 1) {
                size++;
            }
        }
        System.out.println(size);
    }
}
