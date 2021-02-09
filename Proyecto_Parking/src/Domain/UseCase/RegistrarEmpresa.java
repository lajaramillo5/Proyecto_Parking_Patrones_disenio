package Domain.UseCase;

import Domain.Entities.CuentaEmpresa;
import Domain.Entities.Empresa;

import Domain.LogeoXEmpresa;

import Persistencia.OperatonDBCuentaEmpresa;
import Persistencia.OperationDBEmpresa;

public class RegistrarEmpresa implements LogeoXEmpresa {

    OperationDBEmpresa repository;

    public RegistrarEmpresa(OperationDBEmpresa repository) {
        this.repository = repository;
    }

    @Override
    public int AgregarEmpresa(Empresa empresa) {
        Empresa objcue = new Empresa();

        //insertar cuenta
        Persistencia.Empresa objCuenta = new Persistencia.Empresa();
        objCuenta.setNombre(empresa.getNombre());
        objCuenta.setDireccion(empresa.getDirección());
        objCuenta.setCodigo(Integer.valueOf(empresa.getCodigo()) );

        repository.Insertar(objCuenta);

        return 1;
    }

}
