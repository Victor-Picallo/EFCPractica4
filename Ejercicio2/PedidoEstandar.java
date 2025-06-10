public class PedidoEstandar extends ProcesadorPedidos {

    public PedidoEstandar(String cliente, String producto, int cantidad, double precioUnitario) {
        super(cliente, producto, cantidad, precioUnitario);
    }

    @Override
    public void procesarPedido() {
        if (cliente == null || cliente.isEmpty() || producto == null || producto.isEmpty()) {
            System.out.println("Error: cliente o producto no válido");
            return;
        }
        imprimirFactura();
    }
}
