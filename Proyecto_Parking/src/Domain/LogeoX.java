package Domain;

import Domain.Entities.Cuenta;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("408e3cd6-55cd-4652-83f2-7abb52c4ace6")
public interface LogeoX {
    @objid ("f077499a-4835-4583-9bb1-ad7d6a9dbfb7")
    void RegistrarCuenta(Cuenta cuenta);

    @objid ("b0a61f8d-3c84-42c9-9ca6-dc1a0224f18d")
    void ExisteMail(Cuenta cuenta);

}
