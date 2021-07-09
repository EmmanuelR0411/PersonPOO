
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	LA CLASE MAIN NO CONTIENE NADA DE LOGICA, SOLO SE MANDA A LLAMAR LO QUE 
//	SE NECESITA
		
//	Instanciamos un objeto que se llama Emmanuel	
		Persona Emmanuel = new Persona();
		Emmanuel.name = "Emmanuel";
		Emmanuel.age = 22;
		System.out.println(Emmanuel.saludar());
		System.out.println(Emmanuel.miEdad());
	}

}
