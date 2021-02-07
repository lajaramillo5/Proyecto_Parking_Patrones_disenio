package Domain;

import Domain.Entities.CuentaEmpresa;
import Domain.Entities.Empresa;

public interface LogeoXEmpresa {

   int RegistrarCuentaEmpresa(CuentaEmpresa cuenta);


   boolean  ExisteEmail(String email, String login);

   
    void AgregarEmpresa(Empresa empresa);

}
