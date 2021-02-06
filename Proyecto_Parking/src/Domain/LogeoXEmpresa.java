package Domain;

import Domain.Entities.CuentaEmpresa;
import Domain.Entities.Empresa;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("430f7d8f-77d9-4eb4-bd97-6e8cb4ced707")
public interface LogeoXEmpresa {
    @objid ("15ea4b61-39e5-49c1-97f8-cebc7010f538")
    void RegistrarCuentaEmpresa(CuentaEmpresa cuenta);

    @objid ("786998fc-a52f-496a-bf49-adfd0ccc9759")
    void ExisteEmail(String email, String login);

    @objid ("8cc7a5de-5fab-4f94-914c-2d90c950a755")
    void AgregarEmpresa(Empresa empresa);

}
