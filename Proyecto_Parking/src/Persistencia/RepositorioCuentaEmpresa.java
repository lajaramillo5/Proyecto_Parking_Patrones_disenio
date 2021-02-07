package Persistencia;

import Adaptadores.CuentaempresaJpaController;
import Adaptadores.EmpresaJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class RepositorioCuentaEmpresa implements OperatonDBCuentaEmpresa {

    @Override
    public List<Cuentaempresa> getAllCuentas() {
        //CuentaJpaController jpaObject= new CuentaJpaController(Persistence.createEntityManagerFactory("cleanArqPU") );
        EntityManager em = Persistence.createEntityManagerFactory("Proyecto_ParkingPU").createEntityManager();
        //return em.createQuery("SELECT * FROM Cuenta ", Cuenta.class).getResultList();
        TypedQuery<Cuentaempresa> query = em.createNamedQuery("Cuentaempresa.findAll", Cuentaempresa.class);
        //List<Cuenta> results = query.getResultList();
        return query.getResultList();
    }

    @Override
    public int Insertar(Cuentaempresa cuenInsercion) {
        try {
           CuentaempresaJpaController jpaObject = new CuentaempresaJpaController(Persistence.createEntityManagerFactory("Proyecto_ParkingPU"));

            jpaObject.create(cuenInsercion);

        } catch (Exception ex) {
            Logger.getLogger(RepositorioCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuenInsercion.getIdCuenta();
    }

    @Override
    public boolean existeLoginEmail(String login, String Email) {
        List<Cuentaempresa> objCuentas = getAllCuentas();
        for (int i = 0; i < objCuentas.size(); i++) {
            if (objCuentas.get(i).getEmail().compareTo(Email) == 0 && objCuentas.get(i).getLogin().compareTo(login) == 0) {
                return true;
            }
        }
        return false;
    }
}


