package com.mycompany.miprimerprogramag8;

import clases.*;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author David Pérez
 */
public class MiPrimerProgramaG8 {

    public static void main(String[] args) {

        ClsResponsable responsable = new ClsResponsable("123", "", "Jefe de operación", "5635627");

        responsable.getNombre();
        
        
        
        ClsBodega bodega = new ClsBodega("BOD12", "BODEGA ARTUROS", 1000, responsable);

        String codigo = bodega.getNombre();
        
        ClsProducto producto1 = new ClsProducto("CO1", "Tapabocas desechable", "Tapabocas", "Prevencion", 5000.0);

        ClsProducto producto2 = new ClsProducto("CO2", "tapabocas de tela", "Tapabocas", "Prevencion", 3000.0);
        
        ClsProducto producto3 = new ClsProducto("CO3", "Guantes", "Guantes", "Emergencia", 1000.0);
        
        bodega.RegistrarEntrada(producto1);
        bodega.RegistrarEntrada(producto2);  
        bodega.RegistrarEntrada(producto3);

        
        System.out.println("El inventario es: \n" + bodega.Mostrarinventario());
        

    }
}
