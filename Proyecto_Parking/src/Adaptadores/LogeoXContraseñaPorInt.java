package Adaptadores;

import Domain.Entities.Cuenta;
import Domain.LogeoX;
import Persistencia.RepositorioCuenta;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0a9106b7-a848-4c17-a5f7-f0623b7f79b5")
public class LogeoXContraseñaPorInt {
    @objid ("714005ac-ebca-41b8-a1f3-6bda66ddffd7")
    public LogeoX logeoX;

    @objid ("29a06592-896b-4cd4-b7d5-986fd5c351f3")
    public RepositorioCuenta repositorioCuenta;

    @objid ("b35a771d-e45b-44a6-92fb-391152d86003")
    public LogeoXContraseñaPorInt(LogeoX logeoX, RepositorioCuenta repositorioCuent) {
    }

    @objid ("9407e0c0-ecb8-42bb-9872-7666277932bd")
    public void RegistrarCuenta(Cuenta cuenta) {
    }

}
