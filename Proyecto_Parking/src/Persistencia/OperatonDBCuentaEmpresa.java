package Persistencia;

import java.util.List;

public interface OperatonDBCuentaEmpresa {

   public List<Cuentaempresa> getAllCuentas();

    public int Insertar(Cuentaempresa cuenInsercion);


    public boolean existeLoginEmail(String login, String Email);
}
