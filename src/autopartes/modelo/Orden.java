package autopartes.modelo;

import java.util.Date;

public class Orden {
    private int id;
    private Cliente cliente;
    public ItemOrden item1;
    public ItemOrden item2;
    public Date fechaOrden;
    public double precioEnvio;
    public double total;
    public String tipoEnvio;
    public String estado;
    public int diasEnvio;
    public static int sigldOrden;

    public Orden(int id, Date fechaOrden, double total) {
        this.id = 00001;
        this.fechaOrden = new Date();
        this.total = 0.0;
    }

    public Orden(Date pFecha) {
        this.fechaOrden = fechaOrden;
    }

   public Orden(int pCliente, Date pFecha) {
        this.cliente = cliente;
        this.fechaOrden = fechaOrden;
    }

    public double getTotalOrden() {


        return total;
    }
}
