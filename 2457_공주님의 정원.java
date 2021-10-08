import java.io.*;
import java.util.*;


public class Main {
    static final int startDate = 301;
    static final int endDate = 1201;

    public static int getCalenderDate(String month, String date) {
        return (Integer.parseInt(month) * 100) + Integer.parseInt(date);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        HashMap<Integer, Integer> flower = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] rawDate = sc.nextLine().split(" ");
            int start = getCalenderDate(rawDate[0], rawDate[1]);
            int end = getCalenderDate(rawDate[2], rawDate[3]);
            if(flower.get(start) == null || flower.get(start) < end) {
                flower.put(start, end);
            }
        }

        boolean flag = false;
        int current = startDate;
        while (current < endDate) {
            int max = current;
            for(int key : flower.keySet()) {
                if(key <= current && max < flower.get(key)) {
                    max = flower.get(key);
                    flag = true;
                }
            }
            if(flag) {
                current = max;
                flag = false;
                count++;
            } else {
                count = 0;
                break;
            }
        }
        System.out.println(count);
    }
}



