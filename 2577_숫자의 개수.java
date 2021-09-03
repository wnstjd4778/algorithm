import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int val=1;
        int[] b = new int[10];
        for(int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            val *=a[i];
        }

        for(int i = 0; i < 10; i++) {
            if(val > 0){
                int frequency = val % 10;
                b[frequency]++;
                val /=  10;
            }
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }
    }
}
