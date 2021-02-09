/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Smart
 */
public class RepositorioEmpresa implements OperationDBEmpresa{

    @Override
    public List<Empresa> getAllCuentas() {
       //CuentaJpaController jpaObject= new CuentaJpaController(Persistence.createEntityManagerFactory("cleanArqPU") );
        EntityManager em = Persistence.createEntityManagerFactory("Proyecto_ParkingLojaPU").createEntityManager();
        //return em.createQuery("SELECT * FROM Cuenta ", Cuenta.class).getResultList();
        TypedQuery<Empresa> query = em.createNamedQuery("Empresa.findAll", Empresa.class);
        //List<Cuenta> results = query.getResultList();
        return query.getResultList(); }

    @Override
    public int Insertar(Empresa cuenInsercion) {
       try {
            EmpresaJpaController jpaObject = new EmpresaJpaController(Persistence.createEntityManagerFactory("Proyecto_ParkingLojaPU"));

            jpaObject.create(cuenInsercion);

        } catch (Exception ex) {
            Logger.getLogger(RepositorioCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuenInsercion.getCodigo(); }
    
}
