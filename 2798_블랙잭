import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();
        StringTokenizer st = new StringTokenizer(val);
        int size = Integer.parseInt(st.nextToken());
        int purpose = Integer.parseInt(st.nextToken());
        int[] cards = new int[size];
        int sum = 0;
        int max = 0;
        String a = br.readLine();
        st = new StringTokenizer(a);
        for(int i = 0; i < size; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                for(int k = j + 1; k < size; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if(max < sum && sum <= purpose) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
