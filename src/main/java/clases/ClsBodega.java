package clases;

import java.util.LinkedList;

/**
 *
 * @author davidperezarias
 */
public class ClsBodega {

    // default, public, private, protected
    private String codigo;  // null
    private String nombre;
    private int capacidad; // 0
    private String ciudad;

    private LinkedList<ClsProducto> listaProductos;
    private ClsResponsable responsable;

    public ClsBodega(String codigo, String nombre, int capacidad, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ciudad = ciudad;
        this.listaProductos = new LinkedList<>();
        //this.responsable = responsable;
    }
    
    
    // GET Y SET

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public LinkedList<ClsProducto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<ClsProducto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ClsResponsable getResponsable() {
        return responsable;
    }

    public void setResponsable(ClsResponsable responsable) {
        this.responsable = responsable;
    }
    
    
    
    
    

    public void RegistrarEntrada(ClsProducto producto) {

        this.listaProductos.add(producto);

    }

    public String Mostrarinventario() {

        String inventario = "";

        for (ClsProducto p : this.listaProductos) {

            inventario += "Código: " + p.codigo + " - Nombre: " + p.nombre
                    + " - Precio: " + p.precio + "\n";
        }

        return inventario;

    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
