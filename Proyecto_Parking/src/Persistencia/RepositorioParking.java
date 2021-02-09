package Persistencia;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class RepositorioParking implements OperationDBParking {

    @Override
    public int Insertar(Parqueadero parking) {
        try {
            ParqueaderoJpaController jpaObject = new ParqueaderoJpaController(Persistence.createEntityManagerFactory("Proyecto_ParkingLojaPU"));

            jpaObject.create(parking);

        } catch (Exception ex) {
            Logger.getLogger(RepositorioCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parking.getIdParqueadero(); }   

    @Override
    public List<Parqueadero> GetAll() {
        //CuentaJpaController jpaObject= new CuentaJpaController(Persistence.createEntityManagerFactory("cleanArqPU") );
        EntityManager em = Persistence.createEntityManagerFactory("Proyecto_ParkingLojaPU").createEntityManager();
        //return em.createQuery("SELECT * FROM Cuenta ", Cuenta.class).getResultList();
        TypedQuery<Parqueadero> query = em.createNamedQuery("Parqueadero.findAll", Parqueadero.class);
        //List<Cuenta> results = query.getResultList();
        return query.getResultList();
    }

}
