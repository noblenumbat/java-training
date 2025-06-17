package practices;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*Agrupar nombres en una lista (collect())
Tengo una lista de nombres con duplicados y quiero agruparlos en un conjunto para eliminar repeticiones.
*/

public class collectPrac {
	public static void main(String args[]) {
		List<String> nombres = List.of("Ana", "Luis", "Ana", "Carlos", "Luis");
		
		Set<String> nombresUnicos = nombres.stream()
				.collect(Collectors.toSet());
		
		System.out.println(nombresUnicos);
	}
}