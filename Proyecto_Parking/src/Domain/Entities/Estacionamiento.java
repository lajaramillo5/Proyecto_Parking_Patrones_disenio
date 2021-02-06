package Domain.Entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("eaf9c5e2-3ca6-4e42-83f9-3ff7b2c86b4b")
public class Estacionamiento {
    @objid ("4361268b-159f-428a-ad88-9db7a7866c5a")
    private int NumeroDeEspacios;

    @objid ("198cb9fa-ceb5-47e6-8365-4739b4475659")
    int getNumeroDeEspacios() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.NumeroDeEspacios;
    }

    @objid ("33ed4c9b-7e4e-4bf1-9224-2dafb590a7cb")
    void setNumeroDeEspacios(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.NumeroDeEspacios = value;
    }

}
