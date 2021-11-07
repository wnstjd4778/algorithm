import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if(str.equals("END")) {
                break;
            }
            String str1 = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                str1 += str.charAt(i);
            }
            System.out.println(str1);
        }
    }
}
