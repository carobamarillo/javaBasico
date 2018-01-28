
public class arraysBidimesionales2 {

	public static void main(String[] args) {
		int [][] matriz = {
				{10,15,16,32,45},
				{54,25,68,78,48},
				{87,187,47,8,44},
				{1,78,54,112,12}
		};
		
		for(int[] fila:matriz) {
			System.out.println();
			
			for(int z: fila) {
				
				System.out.print(z+" ");
			}
		}

	}

}
