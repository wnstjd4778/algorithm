package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] result = new int[91];
		result[1] = 1;
		result[2] = 1;
		result[3] = 2;
		for(int i = 4; i <= n; i++){
			result[i] = result[i-1]+i-2;
		}
		System.out.println(result[n]);

	}

}
