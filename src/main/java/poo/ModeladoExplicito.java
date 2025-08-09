package poo;

public class ModeladoExplicito {
	public static void main (String args[]) {
		//ERROR
		// En este caso la superclase no puede resolver el tipo de variable 
//		Employee = new Manager("Jonathan",400.0,2024,06,29);
//		empleado.setIncetivo(150.0);// Error en tiempo de compilación
		
		//-------------------------------------------------------------------
		
		// Opciones disponibles para evitar este error de compilación
		// 1) HACER UN MODELADO EXPLICITO DE TIPO (type casting):
		
		// el compilador permite hacer un modelado explícito de tipo
		// de una variable referencia polimórfica a uno de los posibles
		// tipos dinámicos de la variable (descendientes del tipo estático de la variable)
		// tipo estático = empleado pertenece a la Superclase Employee
		// descendiente = Subclase Manager
		// NOTA: un moldeado no compila si el tipo indicado en el moldeado no es compatible
		// (descendiente) con el tipo estático de la variable referencia.
		// Que un moldeado compile no implica que sea correcto ya que puede fallar en tiempo
		// de ejecución
//		Employee empleado = new Employee("Jonathan",400.0,2024,06,29);
//		((Manager)empleado).setIncentivo(null);
		
		
		
		// 2) CONSULTAR EN TIEMPO DE EJECUCIÓN (Opción recomendada)
		// El operador instanceof, permite consultar en tiempo de ejecución si el tipo
		// dinámico de una variable referencia es compatible con un tipo. 
		// Este operador permite garantizar que, éste va a ser correcto en tiempo de ejecución.
		Employee empleado = new Employee("Jonathan",400.0,2024,06,29);
		if(empleado instanceof Manager) {
			((Manager)empleado).setIncentivo(null);
		}
		
		
	}
}