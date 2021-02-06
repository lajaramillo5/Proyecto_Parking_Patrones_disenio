package Adaptadores;

import Domain.RegistroDeParking;
import Persistencia.RepositorioParking;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f62cdf1b-6d11-4692-a75f-75d96c171e8a")
public class RegistroDeParkingPortInt {
    @objid ("a372d6f0-9aa0-4620-bc00-a0dc19ee4b4d")
    public RegistroDeParking registroDeParking;

    @objid ("64f8e54d-8649-4eac-8a54-2dbeabdb2235")
    public RepositorioParking repositorioParking;

    @objid ("dd21a93e-bd46-4aff-ba5b-44b3990b9c08")
    public RegistroDeParkingPortInt(RepositorioParking Cuenta) {
    }

}
