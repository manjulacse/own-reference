package javapackage;

import java.util.Scanner;

public class Arrayelementcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {5,3,5,2};
int i;
int count=0;
System.out.println("enter the element if you want the element coount");
Scanner obj= new Scanner (System.in);
int element= obj.nextInt();

for(i=0; i<a.length; i++) {
	
	if(a[i]==element)
	{    count++;
		
		
	
	}
}
System.out.println(count);
	}

}
