package Domain;

import Domain.Entities.CuentaEmpresa;
import Domain.Entities.Empresa;

public interface LogeoXCuentaEmpresa {

   int RegistrarCuentaEmpresa(CuentaEmpresa cuenta);


   boolean  ExisteEmail(String email, String login);

   
 

}
