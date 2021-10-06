import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'U' && count == 0) {
                count++;
            }
            if (str.charAt(i) == 'C' && count == 1) {
                count++;
            }
            if (str.charAt(i) == 'P' && count == 2) {
                count++;
            }
            if (str.charAt(i) == 'C' && count == 3) {
                count++;
            }
            if (count == 4) {
                break;
            }
        }
        if(count == 4) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}


