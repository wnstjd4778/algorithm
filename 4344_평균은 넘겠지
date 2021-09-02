import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int average = 0;
        double result = 0;
        for(int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
            int[] val = new int[b[i]];
            for(int j = 0; j < b[i];j++) { // 평균을 구함
                val[j] = sc.nextInt();
                average += val[j];
            }
            average /= b[i];
            for(int j = 0; j < b[i]; j++) { // 평균보다 넘는 학생들의 수를 구함
                if(average < val[j]) {
                    result++;
                }
            }
            result = result*100/b[i];
            System.out.println(String.format("%.3f", result) + "%");
            result = 0;
            average = 0;
        }
    }
}
