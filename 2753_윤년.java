package dynamic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		if(n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)){
			a = 1;
		}
		else{
			a = 0;
		}
		System.out.println(a);
	}

}
