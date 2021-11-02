import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        if(count1 >= count2) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }

    }
}
