import java.io.*;
import java.util.*;


public class Main {

    static int nNum, m, min;
    static String n;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        n = br.readLine();
        nNum = Integer.parseInt(n);
        m = Integer.parseInt(br.readLine());
        check = new boolean[10];
        min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            check[Integer.parseInt(st.nextToken())] = true;
        }
       if(n.equals("100")) {
           System.out.println(0);
           return;
       }
       int count = Math.abs(100 - nNum);
       min = min > count ? count : min;
       dfs(0, "");
       System.out.println(min);
    }

    public static void dfs(int idx, String click) {
        for(int i = 0; i < 10; i++) {
            if(!check[i]) {
                String newStr = click + i;
                int count = Math.abs(nNum - Integer.parseInt(newStr)) + newStr.length();
                min = min > count ? count : min;
                if(idx < 6) {
                    dfs(idx + 1, newStr);
                }
            }
        }
    }

}
