package poo;

public interface A {
	default void doSth() {
		System.out.println("Inside A");
	}
}