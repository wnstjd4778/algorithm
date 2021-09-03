import java.util.Scanner;
// while문을 사용해 i를 1씩 올리면서 대입하면서 정답을 찾는 알고리즘을 사용하였는데 시간초과가 나왔다. 그래서 한번더 생각했더니
// a/(c-b)+1를 써 빠르고 쉽게 구할수 있었다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b >= c) {
            System.out.println(-1);
            return;
        }
        int value = a / (c-b) + 1;

        System.out.println(value);
    }
}
