import java.util.*;

public class entrada_Ejemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduce edad");
		
		int edad = entrada.nextInt();
		edad++;
		
		System.out.println("Hola " + nombreUsuario + ".El año que viene tendras " + edad + " años!");
	}

}
