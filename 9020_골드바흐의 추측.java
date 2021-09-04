import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] check = new int[10000];
        int value = Integer.parseInt(br.readLine());
        for(int i = 0; i < value; i++) {
            int a = Integer.parseInt(br.readLine());
            int[] num = new int[a];
            int distance = a+1;
            int max = 0;
            int min = 0;
            for(int j = 2; j < a; j++) { // 에라토스테네스의 체 알고리즘으로 소수가 아닌 것을 체크한다.
                if(check[i] == 0) {
                    for (int k = (int) Math.pow(j, 2); k < a; k += j) {
                        check[k] = k;
                    }
                }
            }
            for(int j = 2; j < a; j++) { // 체크를 해서 num배열에 j를 넣는다.
                if(check[j] == 0) {
                    num[j] = j;
                }
            }
            for(int j = 0; j < a; j++) { 
                if(num[j] != 0) { // num[j]가 0이면 소수가 아니다.
                    int q = a - num[j]; // a에서 소수를 뺀다
                        if(q == num[q]) { // 뺀 값이 소수인지 체크한다.
                            int w = num[j];
                            if(w - q < distance && w - q >= 0) { // distance가 제일 작은 것을 구한다.
                                distance = w - q;
                                min = q;
                                max = num[j];
                            }
                        }
                }
            }
            System.out.println(min + " " + max);
        }
    }
}
