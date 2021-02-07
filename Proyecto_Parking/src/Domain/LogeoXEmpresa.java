package Domain;

import Domain.Entities.CuentaEmpresa;
import Domain.Entities.Empresa;

public interface LogeoXEmpresa {

    void RegistrarCuentaEmpresa(CuentaEmpresa cuenta);


    void ExisteEmail(String email, String login);

   
    void AgregarEmpresa(Empresa empresa);

}
