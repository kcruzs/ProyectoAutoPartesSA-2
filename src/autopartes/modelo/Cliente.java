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


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                '}';
    }
}