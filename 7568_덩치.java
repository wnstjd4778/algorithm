import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] kg = new int[size];
        int[] cm = new int[size];
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            String a = br.readLine();
            st = new StringTokenizer(a);
            kg[i] = Integer.parseInt(st.nextToken());
            cm[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if (kg[i] < kg[j] && cm[i] < cm[j]) {
                    num[i]++;
                }
            }
            System.out.print((num[i]+1) + " ");
        }
    }
}
