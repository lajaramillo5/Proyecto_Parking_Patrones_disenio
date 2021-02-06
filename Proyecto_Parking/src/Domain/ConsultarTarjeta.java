package Domain;

import Domain.Entities.Cliente;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8f42ae52-f475-44ab-896c-324e2b305041")
public interface ConsultarTarjeta {
    @objid ("f7e51102-a24b-41f9-903b-cfa9a4d0d80f")
    void ConsultarSaldo(Cliente saldo);

    @objid ("0af28bf0-4df1-49c1-a40e-0cafe0d6a277")
    void RecargarSaldo(Cliente recargar);

}
