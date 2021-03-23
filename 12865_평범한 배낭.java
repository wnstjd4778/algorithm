package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] kg = new int[a+1];
		int[] value = new int[a+1];
		int[][] dp = new int[a+1][b+1];
		for(int i = 1; i <= a; i++){
			kg[i] = sc.nextInt();
			value[i] = sc.nextInt();
		}
		for(int i = 1; i <= a; i++){
			for(int j = 1; j <= b; j++){
				dp[i][j] = dp[i-1][j];
				if(j-kg[i] >= 0)
				dp[i][j] = Math.max(dp[i-1][j-kg[i]]+value[i], dp[i-1][j]);
			}
		}
		System.out.println(dp[a][b]);
	}

}
