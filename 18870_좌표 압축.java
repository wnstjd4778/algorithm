import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[size];
        int[] num2 = new int[size];
        for(int i = 0; i < size; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            num2[i] = num[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(num);
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(!map.containsKey(num[i])) {
                map.put(num[i], count);
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++) {
            sb.append(map.get(num2[i])).append(' ');
        }
        System.out.println(sb);
    }
}
