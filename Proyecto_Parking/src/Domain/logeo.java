package Domain;

import Entities.Administrador;
import Entities.Cuenta;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("785b4548-a21b-4394-8a8e-2d7837ef4188")
public interface logeo {
    @objid ("2e78f456-6588-4826-8a60-7aa36d81ef9c")
    boolean ExistenciaLoginEmail(String email, String contraseña);

    @objid ("e6dec10b-3547-4bb0-ba61-aa53341de86f")
    void RegistrarAdministracion(Administrador admin);

    @objid ("bbd31cf5-3e8b-44a6-8161-82360db77c6c")
    void Registar(Cuenta cuenta);

}
