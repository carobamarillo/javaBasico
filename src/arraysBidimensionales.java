import java.util.*;

public class arraysBidimensionales {

	public static void main(String[] args) {
	        
			final int FILAS = 5, COLUMNAS = 4;
	        Scanner sc = new Scanner(System.in);
	        int i, j, mayor, menor;
	        int filaMayor, filaMenor, colMayor, colMenor;
	        int[][] A = new int[FILAS][COLUMNAS];
	        System.out.println("Lectura de elementos de la matriz: ");
	        for (i = 0; i < FILAS; i++) {
	            for (j = 0; j < COLUMNAS; j++) {
	                System.out.print("A[" + i + "][" + j + "]= ");
	                A[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("valores introducidos:");
	        for (i = 0; i < A.length; i++) { 
	            for (j = 0; j < A[i].length; j++) {
	                System.out.print(A[i][j] + " ");
	            }
	            System.out.println();
	        }
	        mayor = menor = A[0][0];//se toma el primero como mayor y menor
	        filaMayor = filaMenor = colMayor = colMenor = 0;

	        for (i = 0; i < A.length; i++) {  //
	            for (j = 0; j < A[i].length; j++) {
	                if (A[i][j] > mayor) {
	                    mayor = A[i][j];
	                    filaMayor = i;
	                    colMayor = j;
	                } else if (A[i][j] < menor) {
	                    menor = A[i][j];
	                    filaMenor = i;
	                    colMenor = j;
	                }
	            }           
	        }
	        System.out.print("Elemento mayor: " + mayor);
	        System.out.println(" Fila: "+ filaMayor + " Columna: " + colMayor);
	        System.out.print("Elemento menor: " + menor);
	        System.out.println(" Fila: "+ filaMenor + " Columna: " + colMenor);

		
		

	}

}
