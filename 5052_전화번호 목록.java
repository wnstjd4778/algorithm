import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] arr = new String[n];
            for(int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }
            Arrays.sort(arr);
            boolean flag = false;
            for(int i = 0; i < n - 1; i++) {
                if(arr[i + 1].startsWith(arr[i])) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
