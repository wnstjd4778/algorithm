import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = st.countTokens();
        int result = 0;
        for(int i = 0; i < size; i++) {
            int num = Integer.parseInt(st.nextToken());
            num = num * num;
            result += num;
        }
        System.out.println(result % 10);
    }
}
