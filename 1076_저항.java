import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ans = 0;
        for(int i = 0; i < 3; i++) {
            String str = br.readLine();
            if(str.equals("black")) {
                if(i == 0) {
                    ans += 0 * 10;
                } else if(i == 1) {
                    ans += 0;
                } else {
                    ans *= 1;
                }
            } else if(str.equals("brown")) {
                if(i == 0) {
                    ans += 1 * 10;
                } else if(i == 1) {
                    ans += 1;
                } else {
                    ans *= 10;
                }
            } else if(str.equals("red")) {
                if(i == 0) {
                    ans += 2 * 10;
                } else if(i == 1) {
                    ans += 2;
                } else {
                    ans *= 100;
                }
            } else if(str.equals("orange")) {
                if(i == 0) {
                    ans += 3 * 10;
                } else if(i == 1) {
                    ans += 3;
                } else {
                    ans *= 1000;
                }
            } else if(str.equals("yellow")) {
                if(i == 0) {
                    ans += 4 * 10;
                } else if(i == 1) {
                    ans += 4;
                } else {
                    ans *= 10000;
                }
            } else if(str.equals("green")) {
                if(i == 0) {
                    ans += 5 * 10;
                } else if(i == 1) {
                    ans += 5;
                } else {
                    ans *= 100000;
                }
            } else if(str.equals("blue")) {
                if(i == 0) {
                    ans += 6 * 10;
                } else if(i == 1) {
                    ans += 6;
                } else {
                    ans *= 1000000;
                }
            } else if(str.equals("violet")) {
                if(i == 0) {
                    ans += 7 * 10;
                } else if(i == 1) {
                    ans += 7;
                } else {
                    ans *= 10000000;
                }
            } else if(str.equals("grey")) {
                if(i == 0) {
                    ans += 8 * 10;
                } else if(i == 1) {
                    ans += 8;
                } else {
                    ans *= 100000000;
                }
            } else if(str.equals("white")) {
                if(i == 0) {
                    ans += 9 * 10;
                } else if(i == 1) {
                    ans += 9;
                } else {
                    ans *= 1000000000;
                }
            }
        }
        System.out.println(ans);
    }
}
