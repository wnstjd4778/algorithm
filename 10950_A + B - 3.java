package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[1000][2];
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			System.out.println(arr[i][0]+arr[i][1]);
		}

	}

}
