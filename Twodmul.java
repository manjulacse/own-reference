package javapackage;

public class Twodmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] []= {
				{2,2},
				{2,2}
		};
		int b[][]= {
				{2,2},
				{2,2}
		};
		int c[][]= new int[2][2];
		int i,j,k;
		
		for(i=0; i<2; i++) {
			for(j=0; j<2; j++) {
				c[i][j]=0;
				for(k=0; k<2; k++) {
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}

	}

}
