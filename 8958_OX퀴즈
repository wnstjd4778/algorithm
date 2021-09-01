import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] strings = new String[a];
        int val = 0;
        int value = 0;
        for(int i = 0; i < a; i++) {
            strings[i] = sc.next();
        }
        //strings[i]에서 하나씩 꺼내 O이면 val을 더하고 아니면 val을 0으로 하고 value에 val을 더한후  value를 출력한다.
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < strings[i].length(); j++) {
                if(strings[i].charAt(j) == 'O'){ 
                  val++;
                } else {
                    val = 0;
                }
                value += val;
            }
            val = 0;
            System.out.println(value);
            value = 0;
        }
    }
}
