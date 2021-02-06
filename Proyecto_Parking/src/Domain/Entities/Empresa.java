package Domain.Entities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7cb71cfa-bb8b-467c-9c57-f6c80fe8b9b2")
public class Empresa {
    @objid ("e7506c13-9bcf-4d6b-b480-3f1c4484f3bd")
    private String codigo;

    @objid ("0cbd4c05-95bd-4ea3-a670-bdc4bdfc521f")
    private String nombre;

    @objid ("e8319147-76a2-4372-a106-d8b144e4319b")
    private String Dirección;

    @objid ("50938884-de2f-4b34-9316-2a6c15e20885")
    public List<Parqueadero> parqueadero = new ArrayList<Parqueadero> ();

    @objid ("99f91ad9-9a5a-445b-9a17-edd9a285abca")
    public List<CuentaEmpresa> cuentaEmpresa = new ArrayList<CuentaEmpresa> ();

    @objid ("c827a36c-be84-41fb-b86a-bb8063e86323")
    String getCodigo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.codigo;
    }

    @objid ("27b6a485-2e6a-4358-8974-fc6986965e2c")
    void setCodigo(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.codigo = value;
    }

    @objid ("3ca34f8d-76a4-4c6c-9d42-53205b63fe3d")
    String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nombre;
    }

    @objid ("43915ec7-bab9-4806-946a-54b1af7f1ea8")
    void setNombre(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nombre = value;
    }

    @objid ("545fef97-a1d3-45d0-9a82-94dcb04445c4")
    String getDirección() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Dirección;
    }

    @objid ("a6e12e39-4275-4c25-b582-7a11e39b8b7b")
    void setDirección(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Dirección = value;
    }

}
