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
public class RepositorioCuentaEmpresa implements OperatonDBCuentaEmpresa {

    @Override
    public List<Cuentaempresa> getAllCuentas() {
        //CuentaJpaController jpaObject= new CuentaJpaController(Persistence.createEntityManagerFactory("cleanArqPU") );
        EntityManager em = Persistence.createEntityManagerFactory("Proyecto_ParkingLojaPU").createEntityManager();
        //return em.createQuery("SELECT * FROM Cuenta ", Cuenta.class).getResultList();
        TypedQuery<Cuentaempresa> query = em.createNamedQuery("Cuentaempresa.findAll", Cuentaempresa.class);
        //List<Cuenta> results = query.getResultList();
        return query.getResultList();
    }

    @Override
    public int Insertar(Cuentaempresa cuenInsercion) {
        try {
            CuentaempresaJpaController jpaObject = new CuentaempresaJpaController(Persistence.createEntityManagerFactory("Proyecto_ParkingLojaPU"));

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


