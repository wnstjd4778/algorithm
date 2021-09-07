import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] distance = new int[size - 1];
        int[] price = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < size; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        long minPrice = price[0];
        long sum = 0;
        for(int i = 0; i < size - 1; i++) {
            if(minPrice > price[i]) {
                minPrice = price[i];
            }
            sum += (minPrice * distance[i]);
        }
        System.out.println(sum);
    }
}
