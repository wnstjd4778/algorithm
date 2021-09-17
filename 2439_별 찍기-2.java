import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= size; i++) {
           for(int j = 1; j <= size - i; j++) {
               sb.append(' ');
           }
           for(int j = 0; j < i; j++) {
               sb.append('*');
           }
           sb.append('\n');
        }
        System.out.println(sb);
    }
}
