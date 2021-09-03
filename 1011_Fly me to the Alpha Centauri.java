import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        for(int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            int distance = b[i] - a[i];

            int max = (int)Math.sqrt(distance);

            if(max == Math.sqrt(distance)) {
                System.out.println(max * 2 - 1); //max값이 나오는 시점에 count
            } else if(distance <= max * max + max) {
                System.out.println(max*2); //같은 max값안에서 카운터가 변하기전
            } else {
                System.out.println(max * 2 + 1); //같은 max값안에서 카운터가 변하기후
            }
        }

    }
}

