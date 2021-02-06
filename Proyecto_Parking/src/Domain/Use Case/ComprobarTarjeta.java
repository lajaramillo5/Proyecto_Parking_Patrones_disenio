package Domain.Use Case;

import Domain.ConsultarTarjeta;
import Domain.Entities.Cliente;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("69c63404-56df-4f4d-b9d9-7e77968f1bbe")
public class ComprobarTarjeta implements ConsultarTarjeta {
    @objid ("888a8547-fd2e-4a4b-aaad-d124cb02b84c")
    public void ConsultarSaldo(Cliente saldo) {
    }

    @objid ("0fcf27a9-70a1-451f-a7e5-d7955c07b418")
    public void RecargarSaldo(Cliente recargar) {
    }

}
