import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int redCount = 0;
        int blueCount = 0;
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) == 'R') {
                redCount++;
            } else {
                blueCount++;
            }
        }
        int min = Integer.MAX_VALUE;
        int count = 0;
        boolean flag = false;
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) == 'R' ) {
                if(i == 0 || flag == true) {
                    count++;
                    flag = true;
                } else {
                    break;
                }
            } else {
                if(i == 0 || flag == false) {
                    count++;
                    flag = false;
                } else {
                    break;
                }
            }
        }
        if(flag) {
            min = Math.min(min, redCount - count);
        } else {
            min = Math.min(min, blueCount - count);
        }
        count = 0;
        flag = false;
        for(int i = n - 1; i >= 0; i--) {
            if(str.charAt(i) == 'R' ) {
                if(i == n - 1 || flag == true) {
                    count++;
                    flag = true;
                } else {
                    break;
                }
            } else {
                if(i == n - 1 || flag == false) {
                    count++;
                    flag = false;
                } else {
                    break;
                }
            }
        }
        if(flag) {
            min = Math.min(min, redCount - count);
        } else {
            min = Math.min(min, blueCount - count);
        }
        min = Math.min(min, redCount);
        min = Math.min(min, blueCount);
        System.out.println(min);
    }
}

