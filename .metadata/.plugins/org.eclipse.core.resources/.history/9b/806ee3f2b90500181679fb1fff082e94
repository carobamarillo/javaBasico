
public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	private final String sexo = "M";
	private double peso;
	private double altura;
	
	/*public Persona(){
		if (sexo.equals("F")){
		
		}
	}
	
	public Persona(String nom, String sexo, String dni){
		
		nombre = nom;
		this.sexo = sexo;
		this.dni = dni;	
		
	}*/	

	public void calcularIMC(){
		double pesoIdeal = this.peso/(this.altura*this.altura);
		if (pesoIdeal > 25){
			
			System.out.println("Usted esta excedido/a de peso");
		}
	}
	
	public void esMayorDeEdad(){
		if(this.edad >= 18){
			System.out.println("Usted es mayor de edad");
		}else{
			System.out.println("Usted no es mayor de edad");
		}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
