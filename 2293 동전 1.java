package dynamic;

import java.util.Scanner;

public class Main {
	static int[] arr = new int[101];
	static int[] dp = new int[10001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		dp[0] = 1;
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = arr[i]; j <= m; j++){
				dp[j] += dp[j - arr[i]];
			}
		}
		System.out.println(dp[m]);

	}
}
