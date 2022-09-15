package javapackage;
import java.util.Scanner;


public class Arrays {
	public static void main(String [] args) {
		int c[]= new int[4];
		Scanner obj= new Scanner (System.in);
		System.out.println("enter array element");
		int i;
		for(i=0; i<c.length; i++)
		{
			c[i]=obj.nextInt();
		}
		
		System.out.println(c);
		// max of array
		int max=c[0];
		for(int j=0; j<c.length; j++) {
			if(c[j]> max) // for minimum if( c[j]<min ) min= c[0]
			{
				max=c[j];
			}
		}
		System.out.println(max);
	}

}
