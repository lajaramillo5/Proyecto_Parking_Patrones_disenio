package Persistencia;

import Adaptadores.EmpresaJpaController;
import Domain.Entities.Empresa;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class RepositorioEmpresa implements OperationEmpresa{

    @Override
    public List<Empresas> getAllCuentas() {
               //CuentaJpaController jpaObject= new CuentaJpaController(Persistence.createEntityManagerFactory("cleanArqPU") );
        EntityManager em = Persistence.createEntityManagerFactory("Proyecto_ParkingPU").createEntityManager();
        //return em.createQuery("SELECT * FROM Cuenta ", Cuenta.class).getResultList();
        TypedQuery<Empresas> query = em.createNamedQuery("Empresas.findAll", Empresas.class);
        //List<Cuenta> results = query.getResultList();
        return query.getResultList();
    }

    @Override
    public int Insertar(Empresas cuenInsercion) {
          try {
          EmpresaJpaController jpaObject = new EmpresaJpaController(Persistence.createEntityManagerFactory("Proyecto_ParkingPU"));

            jpaObject.create(cuenInsercion);

        } catch (Exception ex) {
            Logger.getLogger(RepositorioCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuenInsercion.getCodigo();
    }

   

}
