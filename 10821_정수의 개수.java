import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ',') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
