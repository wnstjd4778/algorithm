import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        int size = 0;
        for(char i = 'a'; i <= 'z'; i++) {
            for(int j = 0; j < value.length(); j++) {
                if(value.charAt(j) == i) {
                    if(i == 'z') {
                        size++;
                        System.out.print(j);
                        break;
                    }
                    size++;
                    System.out.print(j + " ");
                    break;
                }
            }
            if(size == 0) {
                if(i == 'z') {
                    System.out.print(-1);
                } else {
                    System.out.print(-1 + " ");
                }
            }
            size = 0;
        }

    }
}
