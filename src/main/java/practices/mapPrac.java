package practices;
import java.util.List;
import java.util.stream.Collectors;

//Calculando el IVA de una lista de productos
public class mapPrac {
	public static void main(String[] args) {
		List<Double> precios = List.of(100.0, 250.0, 80.0, 40.0); //Lista inmutable (no se puede modificar después de crearla) con List.of
		
		List<Double> preciosConIVA = precios.stream()
				.map(precio -> precio * 1.19)
				.collect(Collectors.toList());
		
		System.out.println(preciosConIVA);
	}
}