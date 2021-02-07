package Domain;

import Domain.Entities.CuentaSocio;

public interface RegistroSocio {

    void RegistrarSocio(CuentaSocio cuentSocio);


    boolean ExisteSocio(String cedula);

}
