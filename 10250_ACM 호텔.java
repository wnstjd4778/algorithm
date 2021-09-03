import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] h = new int[size];
        int[] w = new int[size];
        int[] t = new int[size];
        int floor;
        int room;
        String roomToString;
        for(int i = 0; i < size; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();
            t[i] = sc.nextInt();
            room = t[i] / h[i] + 1;
            floor = t[i] % h[i];
            if(floor == 0) {
                floor = h[i];
            }
            if(t[i] % h[i] == 0) {
                room--;
            }
            if(room < 10) {
                roomToString = "0"+room;
            } else {
                roomToString = String.valueOf(room);
            }
            System.out.println(floor+roomToString);
        }
    }
}

