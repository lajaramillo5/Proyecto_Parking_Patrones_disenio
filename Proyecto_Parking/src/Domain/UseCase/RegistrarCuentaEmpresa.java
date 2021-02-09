package Domain.UseCase;

import Domain.Entities.CuentaEmpresa;
import Domain.LogeoXCuentaEmpresa;

import Domain.LogeoXEmpresa;
import Persistencia.Empresa;
import Persistencia.OperatonDBCuentaEmpresa;
import Persistencia.OperationDBEmpresa;

public class RegistrarCuentaEmpresa implements LogeoXCuentaEmpresa {

    OperatonDBCuentaEmpresa repository;

    public RegistrarCuentaEmpresa(OperatonDBCuentaEmpresa repository) {
        this.repository = repository;
    }

    public int RegistrarCuentaEmpresa(CuentaEmpresa cuenta) {
        CuentaEmpresa objcue = new CuentaEmpresa();
        int id = repository.getAllCuentas().size();
        if (!ExisteEmail(cuenta.getLogin(), cuenta.getEmail())) {
            //insertar cuenta

            Persistencia.Cuentaempresa objCuenta = new Persistencia.Cuentaempresa();
            objCuenta.setEmail(cuenta.getEmail());
            objCuenta.setLogin(cuenta.getLogin());
            objCuenta.setPassword(cuenta.getPassword());
            objCuenta.setIdCuenta(id+1);
            objCuenta.setCodigoEmpresa(Integer.valueOf(cuenta.getEmpresa().getCodigo()));
            repository.Insertar(objCuenta);

            return 1;
        }
        return -1;
    }

    public boolean ExisteEmail(String email, String login) {
        return repository.existeLoginEmail(login, email);
    }

}
