import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        for(int i=0; i<8; i++)
            arr[i]=sc.nextInt();
        sc.close(); //입력값 받기 완료

        int asc=1;
        int dsc=8;

        for(int i=0; i<8; i++) {
            if(arr[i]==asc)
                asc++;
            if(arr[i]==dsc)
                dsc--;
        }

        if(asc==9) System.out.println("ascending");
        else if(dsc==0) System.out.println("descending");
        else System.out.println("mixed");
    }
}
