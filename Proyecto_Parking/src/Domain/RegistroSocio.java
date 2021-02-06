package Domain;

import Domain.Entities.CuentaSocio;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fc4d8284-114b-44da-9d42-a951621a978d")
public interface RegistroSocio {
    @objid ("1ae08dde-c407-4742-a788-690f0aa60a22")
    void RegistrarSocio(CuentaSocio cuentSocio);

    @objid ("2bc52f48-30b8-449a-9a5e-2b5895e40d33")
    boolean ExisteSocio(String cedula);

}
