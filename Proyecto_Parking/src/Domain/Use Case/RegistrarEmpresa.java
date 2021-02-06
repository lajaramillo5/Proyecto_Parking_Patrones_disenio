package Domain.Use Case;

import Domain.Entities.CuentaEmpresa;
import Domain.Entities.Empresa;
import Domain.LogeoXEmpresa;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("50c4cc5f-ea53-4421-b062-c1a37759b203")
public class RegistrarEmpresa implements LogeoXEmpresa {
    @objid ("4a349cf5-27cf-413c-9be6-3512be3b09be")
    public void RegistrarCuentaEmpresa(CuentaEmpresa cuenta) {
    }

    @objid ("b8e6bf14-fb39-40e2-b073-40e646b806e4")
    public void ExisteEmail(String email, String login) {
    }

    @objid ("b85616bf-9a12-4216-90f6-142cc3bf59be")
    public void AgregarEmpresa(Empresa empresa) {
    }

}
