import java.io.*;
import java.util.*;


public class Main {
    static long a,b;
    static long min = Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        go(a,b,0);
        if(min==Long.MAX_VALUE) {
            System.out.println(-1);
        }else {
            System.out.println(min+1);
        }

    }
    private static void go(long x,long y,long cnt) {
        if(x==y) {
            min = Math.min(min, cnt);
            return;
        }
        if(2*x<=y) {
            go(2*x,y,cnt+1);
        }
        if(10*x+1<=y) {
            go(10*x+1,y,cnt+1);
        }


    }
}


