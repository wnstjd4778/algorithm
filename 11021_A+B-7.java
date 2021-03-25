package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		for(int i = 1; i <= n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++){
			System.out.println("Case #"+i+": "+(a[i]+b[i]));
		}
	}

}
