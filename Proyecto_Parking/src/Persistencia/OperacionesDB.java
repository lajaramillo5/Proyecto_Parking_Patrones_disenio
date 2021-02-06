package Persistencia;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("391aa027-68ed-47e0-bd67-73da7c917e01")
public interface OperacionesDB {
    @objid ("c2315b3b-5b12-4035-b739-f7a9a59f76de")
    void Insertar();

    @objid ("fbcc02f5-9feb-4fc0-bb25-1508985701fa")
    void GetAll();

    @objid ("01f74512-4eec-4de0-951e-bdd7be45654d")
    void ExisteLogin(String email, String user);

}
