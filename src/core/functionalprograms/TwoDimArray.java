package core.functionalprograms;

import java.util.Scanner;

public class TwoDimArray {

	final static int integerarr = 0;
	final static int doublearr = 1;
	final static int booleanarr = 2;

	public int[][] intarr(int m, int n) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[m][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Enter array value at index (" + i + "," + j + ") : ");
				a[i][j] = scan.nextInt();
			}

		}
		System.out.print("Given 2D array values are : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		return a;

	}

	public double[][] darr(int m, int n) {
		Scanner scan = new Scanner(System.in);

		double a[][] = new double[m][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Enter array value at index (" + i + "," + j + ") : ");
				a[i][j] = scan.nextDouble();
			}

		}
		System.out.print("Given 2D array values are : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		return a;

	}

	public boolean[][] barr(int m, int n) {
		Scanner scan = new Scanner(System.in);
		boolean a[][] = new boolean[m][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Enter array value at index (" + i + "," + j + ") : ");
				a[i][j] = scan.nextBoolean();
			}

		}
		System.out.print("Given 2D array values are : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		return a;
	}

	public static void main(String[] args) {

		TwoDimArray ta = new TwoDimArray();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter row size : ");
		int n = scan.nextInt();
		System.out.print("Enter column size : ");
		int m = scan.nextInt();

		System.out.println("choose 0 for integer array ");
		System.out.println("choose 1 for double array ");
		System.out.println("choose 2 for boolean array ");

		int option = scan.nextInt();

		switch (option) {
		case integerarr:
			int intarr[][] = ta.intarr(m, n);
			break;
		case doublearr:
			double darr[][] = ta.darr(m, n);
			break;
		case booleanarr:
			boolean barr[][] = ta.barr(m, n);
			break;
		default:
			System.out.println("choose a valid option");
			break;
		}

	}

}
