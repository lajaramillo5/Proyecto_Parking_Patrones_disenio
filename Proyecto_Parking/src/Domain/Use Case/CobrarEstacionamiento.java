package Domain.Use Case;

import Domain.CalcularCobro;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("41efefda-cfe4-4a7d-bec3-d4aa6cbff7a9")
public class CobrarEstacionamiento implements CalcularCobro {
    @objid ("f57c1a62-c86e-469b-82d2-9fd342261fc4")
    public int CalcularHoras(String Inicio, String fin) {
    }

    @objid ("eef9b0bd-b778-4eff-9be0-4e44ea4a0715")
    public double CalcularCobro(int horasTotales, double montoXhora) {
    }

    @objid ("fc6db44a-3426-49d7-8aac-2737579ecc23")
    public void CancelarPago(String montoTotal) {
    }

}
