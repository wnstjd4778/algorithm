import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        boolean isExist = false;
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'S') {
                count++;
            } else {
                count++;
                i++;
                isExist = true;
            }
        }
        if(isExist) {
            System.out.println(count + 1);
        } else {
            System.out.println(count);
        }
    }
}


