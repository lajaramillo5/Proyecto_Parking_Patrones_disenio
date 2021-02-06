package Persistencia;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e0e5578a-4c35-4fcd-ab2e-628abdd94329")
public interface OperationDBCliente {
    @objid ("aedd136a-40b0-4c3c-bb44-d2427a174e2a")
    void insertar();

    @objid ("1b937385-9d1d-43d5-adf3-12b706df2944")
    void GetAll();

    @objid ("e7c1e0b2-bb77-41b7-bb2e-edc9f366e9b9")
    boolean ExisteSocio(String cedula);

}
