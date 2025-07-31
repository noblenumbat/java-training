package poo;

public class EjemPolimorfismo {
	public static void main (String args[]) {
		Employee empleado = new Employee("Jonathan",400.0,2024,06,29);
		Manager admin = new  Manager("Jhensy",400.0,2024,06,29);
		admin.setIncentivo(150.0);
		empleado.getSueldo();//Llama al método de la superclase 
		empleado = admin;
		admin.getSueldo(); //Llama al método de la subclase
		//Asignación polimórfica

		
	}
}