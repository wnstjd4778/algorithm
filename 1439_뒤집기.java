import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count1 = 0;
        int count2 = 0;
        boolean flag = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                if(!flag) {
                    count1++;
                    flag = true;
                }
            } else {
                flag = false;
            }
        }
        flag = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') {
                if(!flag) {
                    count2++;
                    flag = true;
                }
            } else {
                flag = false;
            }
        }
        System.out.println(Math.min(count1, count2));
    }
}


