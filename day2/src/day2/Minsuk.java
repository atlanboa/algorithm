package day2;

import java.util.Scanner;

public class Minsuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		int k;
		int[] students;
		for(int i=0; i<t; i++) {
			n = sc.nextInt();
			k = sc.nextInt();
			students = new int[n+1];
			for(int j=0; j<k; j++) {
				students[sc.nextInt()] = 1;
			}
			System.out.print("#"+(i+1)+" ");
			for(int j=1; j<n+1; j++) {
				if(students[j] == 0) {
					System.out.print(j+" ");
				}
			}
			System.out.print("\n");
			
		}
	}


}
