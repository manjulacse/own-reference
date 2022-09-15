package javapackage;
import java.util.Arrays;
public class Twodarray {
public static void main(String args[])
{
	int[][] a= new int[2][2];
	a[0][0]=2;
	a[0][1]=3;
	a[1][0]=5;
	a[1][1]=8;
	System.out.println(Arrays.toString(a));
	for (int i=0; i<a.length; i++) {
		for(int j=0; j<a.length; j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
