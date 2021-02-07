package Domain.Entities;

import java.util.ArrayList;
import java.util.List;


public class Empresa {

    private String codigo;


    private String nombre;


    private String Dirección;
    public List<Parqueadero> parqueadero = new ArrayList<Parqueadero> ();


    public List<CuentaEmpresa> cuentaEmpresa = new ArrayList<CuentaEmpresa> ();

    
    String getCodigo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.codigo;
    }


    void setCodigo(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.codigo = value;
    }

 
    String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nombre;
    }

   
    void setNombre(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nombre = value;
    }


    String getDirección() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Dirección;
    }


    void setDirección(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Dirección = value;
    }

}
