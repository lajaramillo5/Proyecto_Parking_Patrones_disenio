package Domain.UseCase ;

import Domain.Entities.CuentaEmpresa;
import Domain.Entities.Empresa;
import Domain.LogeoXEmpresa;
import Persistencia.OperationEmpresa;
import Persistencia.OperatonDBCuentaEmpresa;

public class RegistrarEmpresa implements LogeoXEmpresa {
    OperatonDBCuentaEmpresa repository;
    OperationEmpresa repository1;
    
    public RegistrarEmpresa( OperatonDBCuentaEmpresa repository) {
        this.repository=repository;
    }

    public RegistrarEmpresa(OperationEmpresa repository1) {
        this.repository1 = repository1;
    }
    

    public int RegistrarCuentaEmpresa(CuentaEmpresa cuenta) {
         CuentaEmpresa objcue = new CuentaEmpresa();
          int id= repository.getAllCuentas().size();
        if (!ExisteEmail(cuenta.getLogin(), cuenta.getEmail())) {
            //insertar cuenta
            
            Persistencia.Cuentaempresa objCuenta= new Persistencia.Cuentaempresa();
            objCuenta.setEmail(cuenta.getEmail());
            objCuenta.setLogin(cuenta.getLogin());
            objCuenta.setPassword(cuenta.getPassword());
            objCuenta.setIdCuenta(id);
            repository.Insertar(objCuenta);
            
            return 1;
        }
        return -1;
    }


    public boolean ExisteEmail(String email, String login) {
        return repository.existeLoginEmail(login, email);
    }


    public void AgregarEmpresa(Empresa empresa) {
    }

}
