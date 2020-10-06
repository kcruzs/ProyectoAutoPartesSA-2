package autopartes.modelo;

public class ItemOrden {
    public int noLinea;
    public int cantidad;
    public Producto producto;

    public ItemOrden(int pNoLinea, int pCantidad, Producto pldProducto) {
        this.noLinea = noLinea;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "ItemOrden{" +
                "noLinea=" + noLinea +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }

    public int getTotalItem() {

        return 0;
    }
}
