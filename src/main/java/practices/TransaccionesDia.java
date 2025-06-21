package practices;

// Cuenta cuantas transacciones ha hecho un cliente en un día.

public class TransaccionesDia {
    public static void main(String[] args) {
        Counter transacciones = new Counter(3); // AQUÍ se define el tope: 3

        for (int i = 1; i <= 5; i++) {
            System.out.println("Intentando transacción #" + i);

            if (transacciones.incrementCount()) {
                System.out.println("✅ Transacción realizada.");
            } else {
                System.out.println("❌ Transacción rechazada.");
            }

            System.out.println("Transacciones acumuladas: " + transacciones.currentCount());
            System.out.println("----------");
        }
    }
}
