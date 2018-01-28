import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		String clave = "Caro";
		String  pass = "";
		
		while(clave.equals(pass)==false) {
			pass = JOptionPane.showInputDialog("Introduce passwrod");
			
			if(clave.equals(pass)==false) {
				System.out.println("Wrong password!");
			}
		}
		System.out.println("You're logged");

	}

}
