package autopartes.modelo;

public class Empresa extends Cliente {

    private String contacto;
    private int descuento;

    public Empresa(String contacto, int descuento) {
        this.contacto = contacto;
        this.descuento = descuento;
    }

    public Empresa(int id, String contacto, int descuento) {
        super(id);
        this.contacto = contacto;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "contacto='" + contacto + '\'' +
                ", descuento=" + descuento +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
