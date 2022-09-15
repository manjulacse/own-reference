package javapackage;

import java.util.Scanner;

public class Twodarrayscan {
	public static void main(String[]args) {
		int a[][]=new int [3][3];
		int i,j;
		System.out.println("get input from user");
		Scanner obj= new Scanner(System.in);
		for(i=0; i<a.length; i++) {
			for(j=0; j<a.length; j++) {
				a[i][j]= obj.nextInt();
			}
		}
		// display the array using loop
		for(i=0; i<a.length; i++) {
			for(j=0; j<a.length; j++) {
				System.out.print( a[i][j]);

		}
			System.out.println();

		}
}
}
