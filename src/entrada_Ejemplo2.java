import javax.swing.*;

public class entrada_Ejemplo2 {

	public static void main(String[] args) {
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad");
		
		int edadUsuario = Integer.parseInt(edad);
		edadUsuario++;
		
		System.out.println("Hola " + nombreUsuario + ",el año que viene tendras " + edadUsuario + " años");

	}

}
