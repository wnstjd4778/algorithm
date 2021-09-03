import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int count = 0;
        for(int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            if(a[i] == 2) {
                count++;
            } else if(a[i] > 1) {
                for (int j = 2; j < a[i]; j++) {
                    if (a[i] % j == 0) {
                        break;
                    }
                    if (j == a[i] - 1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}

