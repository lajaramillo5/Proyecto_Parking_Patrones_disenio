package Adaptadores;

import Domain.Entities.CuentaEmpresa;
import Domain.LogeoXEmpresa;
import Persistencia.OperatonDBCuentaEmpresa;
import Persistencia.RepositorioCuentaEmpresa;

public class LogeoXEmpresaPortInt {

    public LogeoXEmpresa logeoXEmpresa;


    public OperatonDBCuentaEmpresa OperatonDBCuentaEmpresa;


    public LogeoXEmpresaPortInt(LogeoXEmpresa logeoXEmpresa, OperatonDBCuentaEmpresa operatonDBCuentaEmpresa) {
               this.logeoXEmpresa = logeoXEmpresa;
        this.OperatonDBCuentaEmpresa = operatonDBCuentaEmpresa;
    }
    

   
    public int Registrar(CuentaEmpresa cuentaEmpresa) {
        return this.logeoXEmpresa.RegistrarCuentaEmpresa(cuentaEmpresa);
    }

}
