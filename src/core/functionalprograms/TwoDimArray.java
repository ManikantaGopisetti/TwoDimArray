package core.functionalprograms;

import java.util.Scanner;

public class TwoDimArray {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = scan.nextInt();
		System.out.print("Enter m value : ");
		int m= scan.nextInt();
		
		int a[][]=new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("Enter array value at index ("+i+","+j+") : ");
				a[i][j]=scan.nextInt();
			}
			
		}
		System.out.print("Given 2D array values are : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		
	}

}
