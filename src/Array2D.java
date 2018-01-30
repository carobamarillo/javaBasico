
public class Array2D {

	public static void main(String[] args) {
		double acumulado;
		double interes = 0.10;
		
		 double [][] saldo = new double[6][5];
		 
		 for(int i=0 ; i<6 ; i++) {
			 saldo[i][0] = 10000;
			 acumulado = 10000;
			 
			 for(int z = 1 ; z<5 ; z++) {
				 acumulado = acumulado + (acumulado*interes);
				 saldo[i][z] =	acumulado;
			 }
			 
			 interes=interes+0.01;
		 }
		 
		 for(int j=0 ; j<6 ; j++) {
			 System.out.println();
			 
			 for(int h= 0; h<5 ; h++) {
				 System.out.printf("%1.2f", saldo[j][h]);
				 System.out.print(" ");
			 }
		 }

	}

}
