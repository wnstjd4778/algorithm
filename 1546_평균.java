import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Double[] b = new Double[a];
        Double max = Double.valueOf(0);
        double average = 0;
        for(int i = 0; i < a; i++) {
            b[i] = sc.nextDouble();
        }
        for(int i = 0; i < a; i++) {
            if(max < b[i]) {
                max = b[i];
            }
        }
        for(int i = 0; i < a; i++) {
            b[i] = b[i]/max*100;
            average += b[i];
        }
        average /= a;
        System.out.println(average);
    }
}
