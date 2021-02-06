package Domain;

import Domain.Entities.Vehículo;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ce543592-a75d-445c-82b3-5af5807c0c9c")
public interface RegistroVehiculo {
    @objid ("665c38e6-74b9-4126-993e-91135a26dee6")
    void RegistrarVehiculo(Vehículo vehiculo);

}
