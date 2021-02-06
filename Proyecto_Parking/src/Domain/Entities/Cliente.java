package Domain.Entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ba87c893-bc8b-41ff-ae1b-2bb02d0b6159")
public class Cliente {
    @objid ("080c4345-94da-47d7-9282-8ab00fed007d")
    private String Nombre;

    @objid ("241d93ec-370c-4afc-8fca-d6d0c01cc822")
    private String Apellido;

    @objid ("3f5ba949-f7b7-400f-93e0-976bd8aee914")
    private String Cedula;

    @objid ("774b5871-5553-4d03-a10a-47f934afdce8")
    public CuentaSocio cuentaSocio;

    @objid ("6a4bb3b5-14a2-45c6-bcf2-c20b61ade0f2")
    String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Nombre;
    }

    @objid ("487b52b1-aa0e-4624-9289-25d59c40a066")
    void setNombre(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Nombre = value;
    }

    @objid ("2b22c560-57f0-4b96-b53e-332ca0c807c6")
    String getApellido() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Apellido;
    }

    @objid ("215f6b14-4009-4e87-8b6c-970315943ed0")
    void setApellido(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Apellido = value;
    }

    @objid ("d7861e8b-fd7c-4ed1-a32d-ebf63f08e28c")
    String getCedula() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Cedula;
    }

    @objid ("23327747-8582-4ffe-b9a0-7874353e1901")
    void setCedula(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Cedula = value;
    }

}
