import java.io.*;
import java.util.*;


public class Main {

    long sum(int[] a) {
        long sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
