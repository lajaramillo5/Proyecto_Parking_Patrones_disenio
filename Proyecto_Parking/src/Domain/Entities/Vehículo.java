package Domain.Entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ace863d9-5fef-4557-9b5b-dd3e8c630189")
public class Vehículo {
    @objid ("32916458-50eb-4e63-975b-a963a90450a3")
    private String Matricula;

    @objid ("c9dd842e-2054-4def-8b0a-1e4002f1af9f")
    private String Color;

    @objid ("e57bd44d-a9a3-4c43-8fb3-4e97be5d3277")
    private String Marca;

    @objid ("e9685e93-f48f-4b41-89b0-6aa3e99a89be")
    String getMatricula() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Matricula;
    }

    @objid ("c1106e19-c4a9-4611-85f8-9ac63e2efae2")
    void setMatricula(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Matricula = value;
    }

    @objid ("564d0e66-b060-41fd-b38c-cf3d896ad734")
    String getColor() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Color;
    }

    @objid ("76f8bdee-3da2-422b-a7eb-434f76d0d50b")
    void setColor(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Color = value;
    }

    @objid ("629db684-0bf8-4698-98de-51aa80667e17")
    String getMarca() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Marca;
    }

    @objid ("a312f840-795e-46f8-8085-df61f2829425")
    void setMarca(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Marca = value;
    }

}
