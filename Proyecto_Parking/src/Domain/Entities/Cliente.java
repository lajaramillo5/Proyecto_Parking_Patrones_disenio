package Domain.Entities;


public class Cliente {

    private String Nombre;


    private String Apellido;


    private String Cedula;

   
    public CuentaSocio cuentaSocio;

   
    String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Nombre;
    }

  
    void setNombre(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Nombre = value;
    }

   
    String getApellido() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Apellido;
    }


    void setApellido(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Apellido = value;
    }

  
    String getCedula() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Cedula;
    }


    void setCedula(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Cedula = value;
    }

}
