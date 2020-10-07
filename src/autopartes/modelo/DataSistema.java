package autopartes.modelo;

import java.util.ArrayList;
import java.util.List;

public class DataSistema {

    public static List<Individual> individual;
    public static List<Empresa> empresa;
    public static List<Producto> productos;
    public static List<Orden> ordenes;

    public void agregarClientesDefault(){
    Individual i1=new Individual(2042123456);
    i1.setNombre("Kevin Gustavo Cruz");
    i1.setDireccion("33 calle 25-30 Zona 12");
    this.individual.add(i1);
}

public void agregarCliente(Individual individual){
    this.individual = new ArrayList<Individual>();
    this.individual.add(individual);
    System.out.println(individual);
}
public void agregarClienteEmpresa(Empresa empresa){
    this.empresa = new ArrayList<Empresa>();
        this.empresa.add(empresa);
    System.out.println(empresa);
}


public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void agregarOrden(Orden orden){
        this.ordenes.add(orden);
    }

}

