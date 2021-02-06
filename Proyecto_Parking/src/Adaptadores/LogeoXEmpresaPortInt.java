package Adaptadores;

import Domain.LogeoXEmpresa;
import Persistencia.RepositorioCuentaEmpresa;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("30cd30ed-f3be-4786-9a10-6ba5de601907")
public class LogeoXEmpresaPortInt {
    @objid ("97e85924-80a8-4e67-96a3-05b0e31c84eb")
    public LogeoXEmpresa logeoXEmpresa;

    @objid ("7f6b24a1-f83e-41be-8be8-34e74ae26884")
    public RepositorioCuentaEmpresa repositorioCuentaEmpresa;

    @objid ("9e0df11a-00e7-4866-9005-a08404878120")
    public LogeoXEmpresaPortInt(LogeoXEmpresa logeoXEmpresa, RepositorioCuentaEmpresa empresa) {
    }

    @objid ("3b24808b-a29b-470c-bfbf-83f1bd3ddfc0")
    public void Registrar(RepositorioCuentaEmpresa repositorioCuentaEmpresa) {
    }

}
