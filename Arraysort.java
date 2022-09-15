package javapackage;
import java.util.Arrays;
public class Arraysort {
	public static void main(String args[]) {
		int a[]= {4,3,7,2};
		int i,j,temp;
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
