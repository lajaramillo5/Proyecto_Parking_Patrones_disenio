/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adaptadores;

import Adaptadores.exceptions.NonexistentEntityException;
import Adaptadores.exceptions.PreexistingEntityException;
import Persistencia.Cuentaempresa;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Smart
 */
public class CuentaempresaJpaController implements Serializable {

    public CuentaempresaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cuentaempresa cuentaempresa) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cuentaempresa);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCuentaempresa(cuentaempresa.getIdCuenta()) != null) {
                throw new PreexistingEntityException("Cuentaempresa " + cuentaempresa + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cuentaempresa cuentaempresa) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cuentaempresa = em.merge(cuentaempresa);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = cuentaempresa.getIdCuenta();
                if (findCuentaempresa(id) == null) {
                    throw new NonexistentEntityException("The cuentaempresa with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuentaempresa cuentaempresa;
            try {
                cuentaempresa = em.getReference(Cuentaempresa.class, id);
                cuentaempresa.getIdCuenta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuentaempresa with id " + id + " no longer exists.", enfe);
            }
            em.remove(cuentaempresa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cuentaempresa> findCuentaempresaEntities() {
        return findCuentaempresaEntities(true, -1, -1);
    }

    public List<Cuentaempresa> findCuentaempresaEntities(int maxResults, int firstResult) {
        return findCuentaempresaEntities(false, maxResults, firstResult);
    }

    private List<Cuentaempresa> findCuentaempresaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuentaempresa.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cuentaempresa findCuentaempresa(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cuentaempresa.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuentaempresaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cuentaempresa> rt = cq.from(Cuentaempresa.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
