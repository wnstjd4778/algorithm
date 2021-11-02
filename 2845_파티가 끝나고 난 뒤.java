import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        int[] arr = new int[5];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) - size;
        }
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
