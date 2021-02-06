package Persistencia;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("818b1b61-bb4a-4860-984d-997d0e10a577")
public interface OperatonDBEmpresa {
    @objid ("618c3d30-8182-4b67-9388-8904ac8b4c3e")
    void insertar();

    @objid ("32e2b898-3eaf-4ae4-9e33-e3d429bac991")
    void GetAll();

    @objid ("620a7272-501f-4c3b-839e-6b3b5cd331ce")
    void ExisteEmail(String email, String login);

}
