package Domain.Use Case;

import Domain.Entities.Cliente;
import Domain.Entities.CuentaSocio;
import Domain.RegistroSocio;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a061aca8-2e1f-4c53-9c02-085fa2b81b84")
public class Registrar Cliente implements RegistroSocio {
    @objid ("098ab49c-0b0d-4202-ad16-08d1938d4d82")
    public void RegistrarSocio(CuentaSocio cuentSocio) {
    }

    @objid ("2e69b610-9ae9-46dd-8caa-4f4de64d284f")
    public boolean ExisteSocio(String cedula) {
    }

    @objid ("96492a75-8c96-4fe0-90b7-025c6174da0c")
    public void AgregarCliente(Cliente cleinte) {
    }

}
