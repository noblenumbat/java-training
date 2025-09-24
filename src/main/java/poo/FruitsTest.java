package poo;

public class FruitsTest {
	public static void main (String[] args) {
		Fruits[] allFruits = Fruits.values();
		for (Fruits f : allFruits)
			System.out.println(f);
		System.out.println();
		Fruits fruit = Fruits.valueOf("NARANJA"); // Si cambio el valor aparece la excepción java.lang.IllegalArgumentException: No enum constant poo.Fruits.Sandia 
		System.out.println("Fruta es: " + fruit);
		fruit = Fruits.PERA;
		if (fruit == Fruits.PERA) {
			System.out.println("La fruta es una pera");
		switch(fruit) {
			case MANZANA:
				System.out.println("El precio de la " + Fruits.MANZANA + " es " + Fruits.MANZANA.getPrecio() + " y el proveedor es " + Fruits.MANZANA.getProveedor());
				break;
			case NARANJA:
				System.out.println("El precio de la " + Fruits.NARANJA + " es " + Fruits.NARANJA.getPrecio() + " y el proveedor es " + Fruits.MANZANA.getProveedor());
				break;
			case PERA:
				System.out.println("El precio de la " + Fruits.PERA + " es " + Fruits.PERA.getPrecio() + " y el proveedor es " + Fruits.PERA.getProveedor());
				break;
			case BANANO:
				System.out.println("El precio del " + Fruits.BANANO + " es " + Fruits.BANANO.getPrecio() + " y el proveedor es " + Fruits.MANZANA.getProveedor());
				break;
			}
		for (Fruits f : allFruits) 
			System.out.println(f + " " + f.ordinal()); // Lo que quiero que se muestre en el for
		
		Fruits naranja = Fruits.NARANJA;
		Fruits manzana = Fruits.MANZANA;
		Fruits naranja2 = Fruits.NARANJA;
		if(naranja.compareTo(manzana) < 0)
			System.out.println(naranja + " esta antes que " + manzana);
		if(naranja.compareTo(naranja2) == 0)
			System.out.println(naranja + " esta en la misma posición que " + naranja2);
		System.out.println();
		if(manzana.equals(naranja))
			System.out.println("Error!");
		if(naranja.equals(naranja2))
			System.out.println(naranja + " tiene los mismos datos que " + naranja2);
		if(naranja == naranja2)
			System.out.println(naranja + " es la misma referencia que " + naranja2);
		}
	}
}