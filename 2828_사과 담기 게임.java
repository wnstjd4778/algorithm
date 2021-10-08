import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        int ans = 0;
        int index = m;
        for(int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > index) {
                ans += (num - index);
                index = num;
            } else if(num < index) {
                if(num > index - m) {
                    continue;
                } else {
                    ans += (index - m - num + 1);
                    index = num + m - 1;
                }
            }
        }
        System.out.println(ans);
    }
}



