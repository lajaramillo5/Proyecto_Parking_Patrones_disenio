package Persistencia;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("89159dec-42af-4672-a86b-220c3e986bd3")
public interface OperationDBVehiculo {
    @objid ("bb6dc8d2-78a1-49fe-b3ac-2b368669331e")
    void Insertar();

    @objid ("465c8458-0391-4323-9a46-3d7ee1412086")
    void GetAll();

    @objid ("7d1b1677-2fa6-4d02-8f75-bc8c00450f9e")
    void Delet();

}
