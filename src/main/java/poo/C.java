package poo;

public interface C extends  A {
	default void doSth() {
		System.out.println("Inside C");
	}
}