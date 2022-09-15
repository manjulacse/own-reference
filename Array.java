

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main( String args[]) {
		// array declaration
		int a[]= new int[6];
		int b[]= new int[5];
		int c[]= new int [4];
		// adding element into array
		a[0]=2;
		a[1]=5;
		a[3]= 4;
		a[4]=5;
		a[5]=6;
		System.out.println(Arrays.toString(a));
		// sum of array a
		int sum=0;
		int k;
		for(k=0; k<a.length;k++) {
			sum=sum+a[k];
		}
		System.out.println(sum);
		// adding array elements using loloop
		int i;
		for(i=0; i<b.length; i++) {
			
			b[i]= i;
			
		}
		System.out.println(Arrays.toString(b));
		// print ele for each loop
		
		
		for(int y:b) {
			System.out.println(y);
		}
		
		int d[]= {6,7,8,9};
		// not possible to add element in d[4]= 4 it give error
		// getting inout from user
		System.out.println("enter arrays element");
		Scanner obj= new Scanner(System.in);
		for(int j=0; i<c.length;i++) {
			c[j]=obj.nextInt();
			
		}
		for(int l:c)
		{
			System.out.println(l);
		}
		
		
		
		
		
		
		

	}

}
