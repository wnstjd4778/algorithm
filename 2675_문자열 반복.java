import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int[] values = new int[value];
        //for문을 반복해서 풀어봄
        for(int i = 0; i < value; i++) {
            values[i] = sc.nextInt();
            String a = sc.next();
            for(int j = 0; j < a.length(); j++) {
                for(int r = 0; r < values[i]; r++) {
                    System.out.print(a.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
