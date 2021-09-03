import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String value =sc.nextLine().trim();
        sc.close();
        String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int result=0;

        for(int i=0;i<arr.length;i++) {
            if(value.contains(arr[i])) {
                value=value.replaceAll(arr[i]," ");
            }
        }
        System.out.println(value.length());
    }
}
