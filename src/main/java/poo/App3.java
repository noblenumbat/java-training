package poo;
// Regla #3 Pág. 100
// Cuando las interfaces tienen métodos duplicados, el programador puede invocar la implmentación deseada.
public class App3 implements A, B {
	@Override
	public void doSth() {
		B.super.doSth();
	}
	public static void main(String[] args) {
		new App3().doSth();
	}
}