package Adaptadores;

import Domain.RegistroSocio;
import Persistencia.RepositorioCuentaSocio;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2080f944-0f23-4ce8-b221-71a5083a9ae0")
public class ResgistroClientesPorInt {
    @objid ("d5ec6256-fa6b-47d0-bf4e-e16c922bbfb7")
    public RegistroSocio registroSocio;

    @objid ("ebb694c4-7ac8-4dbf-a5d2-0fa05b49ca18")
    public RepositorioCuentaSocio repositorioCuentaSocio;

    @objid ("fe59e16d-4b22-4c5e-992e-9df4aa18e61e")
    public ResgistroClientesPorInt(RepositorioCuentaSocio cuenta) {
    }

}
