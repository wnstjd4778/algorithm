import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//동전의 조건이 특별해서 동적 프로그래밍보다 빠르게 답을 찾을 수 있는 문제(그리디 알고리즘)
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] val = new int[size];
        for(int i = 0; i < size; i++) {
            val[i] = Integer.parseInt(br.readLine());
        }
        for(int i = size - 1; i >= 0; i--) {
            if(max / val[i] >= 1) {
                count = count + max / val[i];
                max = max - val[i] * (max / val[i]);
            }
        }
        System.out.println(count);
    }

}
