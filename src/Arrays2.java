
public class Arrays2 {

	public static void main(String[] args) {
		String [] paises = {"Argentina","Colombia","Venezuela","Chile","Peru"};
		
		/*for(int i= 0 ; i<paises.length ; i++) {
			
			System.out.println("Index: " + i + ", Valor: " + paises[i]);
		}*/
		
		//For each -->
		
		for(String pais:paises) {
			System.out.println(pais);
		}

	}

}
