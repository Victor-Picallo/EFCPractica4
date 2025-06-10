public class Main {

    public static void main(String[] args) {
        
        ProcesadorPedidos pedido1 = new PedidoEstandar("Cliente1", "Producto1", 2, 100.0);
        ProcesadorPedidos pedido2 = new PedidoEstandar("Cliente2", "Producto2", 3, 50.0);

        pedido1.procesarPedido();
        pedido2.procesarPedido();
    }

}
