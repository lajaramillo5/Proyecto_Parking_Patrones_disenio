package Domain.Entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e4669898-8466-4873-8f8d-e440f25ccb30")
public class Administrador {
    @objid ("0566e485-d57a-465b-937e-58422fcb8da0")
    private String Nombre;

    @objid ("4926fbb6-1507-4d7d-86b9-419250b3a785")
    private String Apellido;

    @objid ("c9276fcb-e6e4-4015-aaee-c38003dcd3aa")
    private String Cedula;

    @objid ("a96ed56a-0641-451c-b256-3e347f7d2cb0")
    public Cuenta cuenta;

    @objid ("4f6cd676-2a44-49a3-a458-9d9686bd6d7f")
    String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Nombre;
    }

    @objid ("98394971-78ac-42c2-a312-ba772329e25a")
    void setNombre(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Nombre = value;
    }

    @objid ("7e3ecf25-1a2b-4d9d-a386-7b6825d1edbc")
    String getApellido() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Apellido;
    }

    @objid ("44398df3-d9ce-468e-9480-18a5d98381a3")
    void setApellido(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Apellido = value;
    }

    @objid ("83d484ec-b217-4931-8543-e5911d0ff2ea")
    void setCedula(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Cedula = value;
    }

    @objid ("43676c8f-1c1e-4272-be84-f8fb2f0747ea")
    String getCedula() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Cedula;
    }

}
