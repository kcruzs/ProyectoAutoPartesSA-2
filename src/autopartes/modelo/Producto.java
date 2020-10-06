package autopartes.modelo;

public class Producto {
    private int id;
    static  int sigldProducto = 2000;
    public String nombre;
    public double precio;

    public Producto(int id) {
        this.id = id;
    }
    public Producto() {
        this.id = sigldProducto++;
    }


}
