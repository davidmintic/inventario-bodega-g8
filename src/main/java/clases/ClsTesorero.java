
package clases;

import interfaces.*;

/**
 *
 * @author davidperezarias
 */
public class ClsTesorero extends ClsEmpleado implements IEmpleadoAhorro {
    
    private String tarjetaProfesional;

    public ClsTesorero(String tarjetaProfesional, String id, String nombre, String cargo, String telefono) {
        super(id, nombre, cargo, telefono);
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    @Override
    public double RegistrarAhorro(double monto) {
       return monto * 0.3;
    }

    @Override
    public double RetirarDinero(double monto) {
         return monto - 10;
    }

    
    
    public void Prueba (){
    
    
        double  valor = 4.6;
        String valorTexto = valor + "";
        
        switch (valorTexto) {
            case "3.2":
                
                break;
            default:
                throw new AssertionError();
        }
        
    }

    
    
    
    
}
