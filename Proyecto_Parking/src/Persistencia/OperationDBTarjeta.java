package Persistencia;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("97002314-99e3-4b7d-8642-cd23199a7009")
public interface OperationDBTarjeta {
    @objid ("82b9f3ad-94bf-4271-b459-1e355c432f87")
    void InsertarSaldo();

    @objid ("60d1f9d0-7d0b-4dc2-9cb7-c2894e50b8c8")
    void GetAllSaldo();

}
