

public class Operators {

	public static void main(String[] args) {
		int a = 5;// Assignment operator
		int b=10;
		//Arithmetic operator
		int c=a+b;
		int d= a-b;
		int e= a*b;
		int f=a/b;
		int g= a%b;
		System.out.print(a+" "+b+" "+ c);
		// Relational operator
		int i=10;
		int h=6;
		
		if(i>h) {
			System.out.println("true");
			}
		else if (i<h)
		{
		System.out.println("true");
		}
		else if (i>=h) {
			System.out.println("true");
		}
		else if (i<=h) {
			System.out.println("truee");
		}
	// comparision operators
		else if (i==h) {
			System.out.println("true");
			}
		else
			System.out.println("i!=h");
		// increment decrement operator
		int j=a++;
		System.out.println(j);
		int k= a--;
		
		System.out.println(k);
		// assignment operators
		int l=10; // l-=10,l*=10,l/=10; l%10;
		l+=10;
		System.out.println(l);
		
	//  ternary operator
		boolean m=a>b?true:false;
		System.out.println(m);
		
		// logical operator
		boolean p=(a>b)&&(a>c);
		boolean q=(a>b)||(a>c);
		System.out.println( p+" "+q);
		
		
		
		
		
		
		
		
			
			
		
		

	}

}
