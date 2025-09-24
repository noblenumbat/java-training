package poo;

public enum Fruits {
	MANZANA(10, "Pepe"), // 10 y "Pepe" son los argumentos del constructor
	NARANJA(9, "Carlos"),
	PERA(12, "Ramón"),
	BANANO(15,"Lucas");
	private Integer precio;
	private String proveedor;
	Fruits (Integer precio, String proveedor) {
		this.precio = precio;
		this.proveedor = proveedor;
	}
	public Integer getPrecio() {
		return precio;
	}
	public String getProveedor() {
		return proveedor;
	}
}