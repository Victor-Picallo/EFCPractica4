public abstract class ProcesadorPedidos {

    protected String cliente;
    protected String producto;
    protected int cantidad;
    protected double precioUnitario;
    protected double iva = 0.21;

    public ProcesadorPedidos(String cliente, String producto, int cantidad, double precioUnitario) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getIva() {
        return iva;
    }

    protected void setIva(double iva) {
        this.iva = iva;
    }

    public double calcularTotal() {
        return getCantidad() * getPrecioUnitario();
    }

    public double calcularIva() {
        return calcularTotal() * getIva();
    }

    public double calcularTotalConIva() {
        return calcularTotal() + calcularIva();
    }

    public abstract void procesarPedido();

    public void imprimirFactura() {
        System.out.println("----- FACTURA -----");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Subtotal: " + calcularTotal());
        System.out.println("IVA (21%): " + calcularIva());
        System.out.println("Total con IVA: " + calcularTotalConIva());
        System.out.println("-------------------");
    }
}
