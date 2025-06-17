package practices;

// Contar hasta 10, pero detenerse al llegar a 7 y omitir el 5
public class BreakContinueBucleWhile{
	public static void main(String[] args) {
		int i = 0;
		while(i <= 10) {
			if(i == 5) {
				i++;
				continue; // omite el número 5
			}
			if(i == 7) break;
			System.out.println("Current num: " + i);
			i++;
			
		}
	}

}