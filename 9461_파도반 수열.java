package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxx = 0;
		int[] a = new int[n+1];
		for(int i = 1; i <= n; i++){
			a[i] = sc.nextInt();
			maxx = Math.max(maxx, a[i]);
		}
		long [] dp = new long[101];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		for(int i = 4; i <= maxx; i++){
			dp[i] = dp[i-2]+dp[i-3];
		}
		for(int i = 1; i <= n; i++){
		System.out.println(dp[a[i]]);
		}
	}

}
