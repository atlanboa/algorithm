package expertAlgo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class Solution {
	static int[][] dp;
	static int[][] items;
	static int n;
	static int l;
	public static int cal(int index, int limit) {
		if(index == n) return 0;
		
		int ret = dp[index][limit];
		if(ret != -1) return ret;
		if (items[index][1] <= limit) {
			ret = cal(index +1, limit - items[index][1]) + items[index][0];
		}
		ret = Math.max(ret, cal(index+1, limit));
		return dp[index][limit] = ret;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	
		for(int i = 0; i < t; i++) {
			n = sc.nextInt();
			l = sc.nextInt();
			items= new int[n][2];
			dp = new int[n][l+1];
			for(int j =0; j<dp.length; j++) {
				Arrays.fill(dp[j], -1);
			}
			
			for(int j =0; j<n; j++) {
				items[j][0] = sc.nextInt();
				items[j][1] = sc.nextInt();
//				0은 value, 1은 calories
			}
			

			System.out.println("#"+(i+1)+" "+cal(0, l));
		}
	

		
	}

}

