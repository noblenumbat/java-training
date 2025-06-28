package practices;

public class TransaccionesDia {
    public static void main(String[] args) {
        Counter transacciones = new Counter();

        realizarTransaccion(transacciones);
        realizarTransaccion(transacciones);
        realizarTransaccion(transacciones);

        System.out.println("Transacciones realizadas hoy: " + transacciones.currentCount());
    }

    public static void realizarTransaccion(Counter c) {
        // lógica de la transacción...
        System.out.println("Transacción exitosa.");
        c.incrementCount();
    }
}


// TrasaccionesDia Modificado
// Cuenta cuantas transacciones ha hecho un cliente en un día.

//public class TransaccionesDia {
//    public static void main(String[] args) {
//        Counter transacciones = new Counter(3); // AQUÍ se define el tope: 3
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Intentando transacción #" + i);
//
//            if (transacciones.incrementCount()) {
//                System.out.println("✅ Transacción realizada.");
//            } else {
//                System.out.println("❌ Transacción rechazada.");
//            }
//
//            System.out.println("Transacciones acumuladas: " + transacciones.currentCount());
//            System.out.println("----------");
//        }
//    }
//}
