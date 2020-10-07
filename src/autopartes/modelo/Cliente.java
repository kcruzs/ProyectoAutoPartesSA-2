package autopartes.modelo;


public class Cliente{

    private int id;
    static  int sigldCliente = 1;
    public String nombre;
    public String direccion;

    public Cliente() {
        this.id = sigldCliente++;
         }

    public Cliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return className+"{" +
                "id=" + id +
                '}';
    }
}