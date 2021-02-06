package Domain.Use Case;

import Domain.Entities.Administrador;
import Domain.Entities.Cuenta;
import Domain.LogeoX;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3547473f-e8b2-498e-b3d5-e52f529fd459")
public class Registrar Administrador implements LogeoX {
    @objid ("7ade4cba-ab7b-45e6-9437-09ec6a869ea2")
    public void AgregarAdministracion(Administrador admin) {
    }

    @objid ("f3433eaa-5c59-40f0-b005-59efd544e570")
    public void RegistrarCuenta(Cuenta cuenta) {
    }

    @objid ("cd3ef705-efb3-4c61-9f79-0775410fbdd8")
    public void ExisteMail(Cuenta cuenta) {
    }

}
