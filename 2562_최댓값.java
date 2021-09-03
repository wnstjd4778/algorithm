import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[9];
        int max = -1000000;
        int size = 0;
        for(int i = 0; i < 9; i++) {
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < 9; i++) {
            if(b[i] > max ){
                max = b[i];
                size = i;
            }
        }
        System.out.println(max);
        System.out.println(size+1);
    }
}
