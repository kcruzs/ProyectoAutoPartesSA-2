package autopartes.modelo;

import java.util.List;

public class DataSistema {

    public static List<Individual> individual;
    public static List<Empresa> empresa;
    public static List<Producto> productos;
    public static List<Orden> ordenes;

public void agregarClientesDefault(){
    Individual i1=new Individual(2042-02140-0116);
    i1.setNombre("Kevin Gustavo Cruz");
    i1.setDireccion("33 calle 25-30 Zona 12");
    this.individual.add(i1);
}

public void agregarCliente(Individual individual){
    this.individual.add(individual);
}
public void agregarClienteEmpresa(Empresa empresa){
this.empresa.add(empresa);
}
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    public void agregarOrden(Orden orden){
        this.ordenes.add(orden);
    }

}

