package autopartes.modelo;

public class Individual extends Cliente{

    private int dpi;

    public Individual(int dpi) {
        this.dpi = dpi;
    }

    public Individual(int id, int dpi) {
        super(id);
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "dpi=" + dpi +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
