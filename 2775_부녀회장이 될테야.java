import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        int[][] people = new int[15][15];
        for(int i = 0; i < 15; i++) {
            people[0][i] = i;
        }
        // 아랫층 호수의 사람수 + 같은 층 앞번호의 사람수를 더하면 해당 호수의 사람을 구할 수 있다. 
        for(int i = 1; i < 15; i++) {
            for(int j = 1; j < 15; j++) {
                people[i][j] = people[i-1][j] + people[i][j-1];
            }
        }
        for(int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            System.out.println(people[a[i]][b[i]]);
        }

    }
}

