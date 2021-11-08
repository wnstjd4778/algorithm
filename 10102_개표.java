import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A') {
                count1++;
            } else {
                count2++;
            }
        }
        if(count1 > count2) {
            System.out.println('A');
        } else if(count1 == count2) {
            System.out.println("Tie");
        } else {
            System.out.println('B');
        }
    }
}
