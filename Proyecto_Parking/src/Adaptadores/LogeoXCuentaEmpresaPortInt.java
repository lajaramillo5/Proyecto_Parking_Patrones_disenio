package Adaptadores;

import Domain.Entities.CuentaEmpresa;
import Domain.LogeoXCuentaEmpresa;
import Domain.LogeoXEmpresa;
import Persistencia.OperatonDBCuentaEmpresa;


public class LogeoXCuentaEmpresaPortInt {

    public LogeoXCuentaEmpresa logeoXEmpresa;


    public OperatonDBCuentaEmpresa OperatonDBCuentaEmpresa;


    public LogeoXCuentaEmpresaPortInt(LogeoXCuentaEmpresa logeoXEmpresa, OperatonDBCuentaEmpresa operatonDBCuentaEmpresa) {
               this.logeoXEmpresa = logeoXEmpresa;
        this.OperatonDBCuentaEmpresa = operatonDBCuentaEmpresa;
    }
    

   
    public int Registrar(CuentaEmpresa cuentaEmpresa) {
        return this.logeoXEmpresa.RegistrarCuentaEmpresa(cuentaEmpresa);
    }

}
