package practices;

public class MultiCounter {
	private Integer countClics;
	private Integer countErrors;
	private Integer countVisitas;
	
	// Características de mi clase o constructor.
	public MultiCounter () {
		this.countClics = 0;
		this.countErrors = 0;
		this.countVisitas = 0;
	}
	
	// MODULO DE CLICS
	// Método de consulta.
	public Integer counterCurrentClics()  {
		return this.countClics;
	}

	// Método de incremento.
	public void counterIncrementClics() {
		this.countClics = this.countClics + 1;
	}
	
	// Reset de contador.
	public void counterResetClics() {
		this.countClics = 0;
	}
	
	// MODULO DE ERRORES
	public Integer counterCurrentErrors()  {
		return this.countErrors;
	}

	// Método de incremento.
	public void counterIncrementErrors() {
		this.countErrors = this.countErrors + 1;
	}
	
	// Reset de contador.
	public void counterResetErrors() {
		this.countErrors = 0;
	}
}