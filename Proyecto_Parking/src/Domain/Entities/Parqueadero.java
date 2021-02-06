package Domain.Entities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7d519877-1bf1-4a45-a392-8bdc62795f32")
public class Parqueadero {
    @objid ("58f60689-7d76-4ab2-98c2-4b22b5656584")
    private String Nombre;

    @objid ("80f3ac75-6196-4c59-bc8c-202e30842ae9")
    private String Dirección;

    @objid ("53b2eda0-ad2f-4a55-9ffc-84f115709698")
    public List<Administrador> administrador = new ArrayList<Administrador> ();

    @objid ("4737f59c-5573-4850-82fa-5a88032779dd")
    public Estacionamiento estacionamiento;

    @objid ("c4a036a3-8789-46de-954b-24170c14f0db")
    String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Nombre;
    }

    @objid ("f4af4f24-8057-4bc9-a0c1-bc68495d9008")
    void setNombre(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Nombre = value;
    }

    @objid ("0b3a3b14-4694-43a7-a1ef-f79caa805abd")
    String getDirección() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Dirección;
    }

    @objid ("1014ddc3-f733-4e36-9341-7f1850cc5968")
    void setDirección(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Dirección = value;
    }

    @objid ("198b9604-d307-4882-9877-f377f3bbdf4d")
    void setEspacios(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Espacios = value;
    }

}
