import java.util.Scanner;
import java.util.StringTokenizer;
// StringToziner을 활용해서 구현해 보았다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String values = "ABC DEF GHI JKL MNO PQRS TUV WXYZ";
        StringTokenizer st = new StringTokenizer(values, " ");
        int result = 0;

        for(int i = 0; i < value.length(); i++) {
            for(int j = 0; j < 8; j++) {
                if(st.nextToken().indexOf(value.charAt(i)) >= 0){
                    result += (3+j);
                    break;
                }
            }
            st = new StringTokenizer(values, " ");
        }
        System.out.println(result);
    }
}
