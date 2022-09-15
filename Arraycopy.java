

	package javapackage;
    import java.util.Arrays;
	public class Arraycopy {
		public static void main(String[] args) {
			
				int c[]= new int [8];
				for(int i=0; i<c.length; i++) {
					c[i]=i;
				}
				System.out.println(Arrays.toString(c));
				int c_copy[]=Arrays.copyOf(c, c.length); // copy method
				System.out.println(Arrays.toString(c_copy));
				int d[]=c;
				System.out.println( Arrays.toString(d));
				
			}
	}



