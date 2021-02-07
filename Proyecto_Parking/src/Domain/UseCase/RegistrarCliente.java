package Domain.UseCase ;

import Domain.Entities.Cliente;
import Domain.Entities.CuentaSocio;
import Domain.RegistroSocio;

public class RegistrarCliente implements RegistroSocio {

    public void RegistrarSocio(CuentaSocio cuentSocio) {
    }

    public boolean ExisteSocio(String cedula) {
        return false;
    }


    public void AgregarCliente(Cliente cleinte) {
    }

}
