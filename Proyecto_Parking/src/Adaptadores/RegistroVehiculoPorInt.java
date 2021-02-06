package Adaptadores;

import Domain.RegistroVehiculo;
import Persistencia.RegostorioVehiculo;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7c26ee12-241e-4262-b8a0-281aa3871053")
public class RegistroVehiculoPorInt {
    @objid ("0daff659-b586-4da6-b578-470ceb3eeb3a")
    public RegistroVehiculo registroVehiculo;

    @objid ("def4d030-7c7c-4be2-aa3c-867a0ff1223c")
    public RegostorioVehiculo regostorioVehiculo;

    @objid ("de6cf06f-58e1-41ee-a444-a64e238e4b7e")
    public RegistroVehiculoPorInt(RegostorioVehiculo vehiculo) {
    }

}
