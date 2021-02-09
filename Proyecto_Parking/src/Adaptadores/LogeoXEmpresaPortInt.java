package Adaptadores;


import Domain.Entities.Empresa;
import Domain.LogeoXEmpresa;

import Persistencia.OperationDBEmpresa;



public class LogeoXEmpresaPortInt {

    public LogeoXEmpresa logeoXEmpresa;


    public OperationDBEmpresa OperatonDBCuentaEmpresa;


    public LogeoXEmpresaPortInt(LogeoXEmpresa logeoXEmpresa, OperationDBEmpresa operatonDBCuentaEmpresa) {
               this.logeoXEmpresa = logeoXEmpresa;
        this.OperatonDBCuentaEmpresa = operatonDBCuentaEmpresa;
    }
    

   
    public int Registrar(Empresa cuentaEmpresa) {
        return this.logeoXEmpresa.AgregarEmpresa(cuentaEmpresa);
    }

}
