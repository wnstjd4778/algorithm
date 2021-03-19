package dynamic;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int q = 0; q < n; q++){
			int a = sc.nextInt();
			int[][] arr = new int[2][a+1];
			int[][] dp = new int[2][a+1];
			for(int i =0; i < 2; i++){
				for(int j = 1; j <= a; j++){
					arr[i][j] = sc.nextInt();
				}
			}
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			for(int i = 2; i <= a; i++){
				dp[0][i] = Math.max(dp[1][i-1],dp[1][i-2])+arr[0][i];
				dp[1][i] = Math.max(dp[0][i-1],dp[0][i-2])+arr[1][i];
			}
				System.out.println(Math.max(dp[0][a], dp[1][a]));
		}

	}

}
