/*
 * Creamos una clase que cuenta con dos metodos, uno muestra su nombre
 * y otro muesttra su edad
 */
public class Persona {
	String name;
	int age;
	
	public String saludar () {
		return "Hola, soy " + this.name;
	}
	
	public String miEdad() {
		return "Mi edad es " + this.age;
	}
	
//	Un metodo privado solo se puede acceder dentro de la misma clase 
}
