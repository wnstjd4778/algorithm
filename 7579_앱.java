import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] memory = new int[n + 1];
        int[] value = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            memory[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }
        int[] table = new int[10001];
        Arrays.fill(table, -1);
        for(int i = 1; i <= n; i++) {
            int cost = value[i];
            for(int j = 10000; j >= cost; j--) {
                if(table[j - cost] != -1) {
                    if(table[j - cost] + memory[i] > table[j]) {
                        table[j] = table[j - cost] + memory[i];
                    }
                }
            }
            if(table[cost] < memory[i]) {
                table[cost] = memory[i];
            }
        }

        for(int i = 1; i <= 10000; i++) {
            if(table[i] >= m) {
                System.out.println(i);
                break;
            }
        }
    }
}
