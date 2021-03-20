package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][11];
		int sum = 0;
		for(int i = 0; i < 10; i++){
			arr[1][i] = 1;
		}
		for(int i = 2; i <= n; i++){
			for(int j = 0; j < 10; j++){
				for(int k = j; k < 10; k++){
					arr[i][j] += arr[i-1][k];
					arr[i][k] %= 10007;
				}
			}
		}
		for(int i = 0; i < 10; i++){
			sum += arr[n][i];
		}
		System.out.println(sum % 10007);
		

	}

}
