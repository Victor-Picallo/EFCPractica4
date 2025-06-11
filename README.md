Refactoriza el siguiente código, usa polimorfismo y herencia

public class NotificadorApp {
    public static void main(String[] args) {
        Notificacion email = Notificacion.EMAIL;
        Notificacion sms = Notificacion.SMS;
        Notificacion push = Notificacion.PUSH;

        procesarNotificacion(email, "Hola por email");
        procesarNotificacion(sms, "Hola por SMS");
        procesarNotificacion(push, "Hola por Push");
    }

    public static void procesarNotificacion(Notificacion tipo, String mensaje) {
        switch (tipo) {
            case EMAIL:
                System.out.println("📧 Procesando notificación por EMAIL...");
                tipo.enviar(mensaje);
                break;
            case SMS:
                System.out.println("📱 Procesando notificación por SMS...");
                tipo.enviar(mensaje);
                break;
            case PUSH:
                System.out.println("🔔 Procesando notificación por PUSH...");
                tipo.enviar(mensaje);
                break;
        }
    }
}

enum Notificacion {
    EMAIL {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Enviando EMAIL: " + mensaje);
        }
    },
    SMS {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Enviando SMS: " + mensaje);
        }
    },
    PUSH {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Enviando PUSH: " + mensaje);
        }
    };

    public abstract void enviar(String mensaje);
}



Refactoriza el siguiente código, usa polimorfismo y herencia

public class ProcesadorPedidos {

    public static void procesarPedido(String cliente, String producto, int cantidad, double precioUnitario) {
        // Validación
        if (cliente == null || cliente.isEmpty() || producto == null || producto.isEmpty()) {
            System.out.println("Error: cliente o producto no válido");
            return;
        }

        // Cálculo total
        double total = cantidad * precioUnitario;
        double iva = total * 0.21;
        double totalConIva = total + iva;

        // Impresión del resumen
        System.out.println("----- FACTURA -----");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Subtotal: " + total);
        System.out.println("IVA (21%): " + iva);
        System.out.println("Total con IVA: " + totalConIva);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        procesarPedido("Juan", "Teclado", 2, 25.5);
        procesarPedido("", "Ratón", 1, 15.0); // debe dar error
    }
}







Optimiza el siguiente código

public class Buscador {

    public static boolean contienePalabraClave(String texto) {
        String clave = "java";
        String textoMin = texto.toLowerCase();
        String[] palabras = textoMin.split(" ");
        boolean encontrada = false;

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (palabra.equals(clave)) {
                encontrada = true;
                break;
            }
        }

        if (encontrada == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(contienePalabraClave("Estoy aprendiendo Java y me encanta."));
        System.out.println(contienePalabraClave("Este texto no contiene la palabra clave."));
    }
}

