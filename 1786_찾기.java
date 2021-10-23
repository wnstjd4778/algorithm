import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String pattern = br.readLine();

        ArrayList<Integer> list = KMP(string, pattern);
        int size = list.size();
        System.out.println(size);

        for(int i = 0; i < size; i++) {
            System.out.print(list.get(i) + 1 + " ");
        }
    }
    static int[] getPi(String pattern) {
        int lenOfPattern = pattern.length();
        int[] pi = new int[lenOfPattern];
        int j = 0;
        for(int i = 1; i < lenOfPattern; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if(pattern.charAt(i) == pattern.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi;
    }

    static ArrayList<Integer> KMP(String str, String pattern) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] pi = getPi(pattern);
        int lenOfStr = str.length();
        int lenOfPattern = pattern.length();
        int j = 0;
        for(int i = 0; i < lenOfStr; i++) {
            while (j > 0 && str.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if(str.charAt(i) == pattern.charAt(j)) {
                if(j == lenOfPattern - 1) {
                    list.add(i - lenOfPattern + 1);
                    j = pi[j];
                } else {
                    j++;
                }
            }
        }
        return list;
    }
}

