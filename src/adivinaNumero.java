import java.util.*;

public class adivinaNumero {

	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		while(numero!=aleatorio) {
			intentos++;
			System.out.println("Introduzca numero");
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("El numero es menor");
			}else if(aleatorio>numero) {
				System.out.println("El numero es mayor");				
			}
		}
		System.out.println("El numero es correcto! Tus intentos fueron " + intentos);
	}

}
