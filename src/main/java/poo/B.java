package poo;

public interface B {
	default void doSth() {
		System.out.println("Inside B");
	}
}