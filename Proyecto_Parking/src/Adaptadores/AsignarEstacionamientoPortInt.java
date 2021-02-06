package Adaptadores;

import Domain.AsignarEstacionamiento;
import Persistencia.RespositorioEspacio;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7143dfbd-5829-4cac-829a-fda2b031af2c")
public class AsignarEstacionamientoPortInt {
    @objid ("7e606ea2-b65c-4552-855f-a8acb235fa39")
    public AsignarEstacionamiento asignarEstacionamiento;

    @objid ("cf869d70-b69b-49dc-9164-008cba5428fe")
    public RespositorioEspacio respositorioEspacio;

    @objid ("e66fe05f-e48f-4543-907e-ec017a061b80")
    public void Registrar(String espacio) {
    }

    @objid ("701d9366-70b6-4f8c-9177-8cec2b87268e")
    public void ResgistrarCobro(AsignarEstacionamiento cobro) {
    }

}
