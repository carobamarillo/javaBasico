import java.util.*;

public class evaluaEdadif {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad = entrada.nextInt();
		
		if(edad>=18) {
			System.out.println("Eres mayor de edad,puedes entrar :)");			
		}else {
			System.out.println("No puedes entrar,no eres mayor de edad :)");
		}

	}

}
