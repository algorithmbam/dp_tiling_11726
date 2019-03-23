package algorithm_tiling;

import java.util.Scanner;

public class Tiling {

	private static int dp[]= new int[1001];
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int input= in.nextInt();
		int result= dp(input);
		
		System.out.println(result);
	}

	public static int dp(int input) {
		
		if(input == 1) {
			return 1;
		} else if (input == 2) {
			return 2;
		} else {
			if(dp[input] != 0) {
				return dp[input];
			} else {
				dp[input]= (dp(input-1) + dp(input-2)) % 10007;
				return dp[input];
			}
		}
	}
}