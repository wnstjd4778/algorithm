import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int size = 1;
        int i = 1;
        while (true) {

            if(size >= a) {
                break;
            }

            size += 6*i;
            i++;
        }
        System.out.println(i);
    }
}
