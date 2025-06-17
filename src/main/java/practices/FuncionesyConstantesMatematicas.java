package practices;

public class FuncionesyConstantesMatematicas{
	
	public static void main(String[] args) {
		double x = 4;
		double y = Math.sqrt(x);
		System.out.println(y); // 2.0
		double z = Math.pow(x, y);
		System.out.println(z); //16.0
		
		int a = 25;
		int b = 45;
		
		System.out.println("Valor máximo: " + Math.max(a, b));
		System.out.println("Valor mínimo: " + Math.min(a, b));
		
	}
}
