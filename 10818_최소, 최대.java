import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int max = -1000000;
        int min = 1000000;
        for(int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < a; i++) {
            if(b[i] > max ){
                max = b[i];
            }
        }
        for(int i = 0; i < a; i++) {
            if(b[i] < min ){
                min = b[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
