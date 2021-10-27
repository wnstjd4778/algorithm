import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int curIndex = 0;
        boolean isOk = true;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'P') {
                curIndex++;
            }
            else {
                if(c == 'A') {
                    if(curIndex >= 2 && i + 1 < s.length() && s.charAt(i + 1) == 'P') {
                        curIndex--;
                        i++;
                    } else {
                        isOk = false;
                        break;
                    }
                } else {
                    isOk = false;
                    break;
                }
            }
        }
        if(curIndex > 1) {
            isOk = false;
        }
        System.out.println(isOk ? "PPAP" : "NP");
    }
}
