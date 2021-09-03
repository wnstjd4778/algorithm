import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String value = sc.next().toLowerCase();//대소문자 구별을 위해 우선 소문자로 다 바꿈
        int[] alphabet = new int[27];
        int max = 0;
        int index = 0;
        //문자열을 입력받고 문자열에서 문자를 하나씩 꺼내 빈번도를 조사함
        for(char i = 'a', size = 0; i <= 'z';size++, i++) {
            for(int j = 0; j < value.length(); j++) {
                if (i == value.charAt(j)) {
                    alphabet[size]++;
                }
            }
        }
        // 빈번도의 최대를 구함
        for(int r = 0; r < 27; r++) {
            if(max < alphabet[r]) {
                max = alphabet[r];
                index = r;
            }
        }
        // 빈번도가 같을시 ?표 출력
        for(int r = 0; r < 27; r++) {
            if(max == alphabet[r] && r != index) {
                System.out.println("?");
                return;
            }
        }
        System.out.println((char)(index+65));

    }
}
