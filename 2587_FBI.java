import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;
        for(int i = 1; i <= 5; i++) {
            String str = br.readLine();
            if(str.contains("FBI")) {
                flag = true;
                System.out.print(i + " ");
            }
        }
        if(!flag) {
            System.out.println("HE GOT AWAY!");
        }
    }
}
