package Adaptadores;

import Domain.ConsultarTarjeta;
import Persistencia.RepositorioTarjeta;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("da1ec3df-f3bb-484f-b01f-0e9365c6647f")
public class ConsultarTarjetaPortInt {
    @objid ("66a67ddb-fa0c-4fdb-a6fc-539b7b9cd01c")
    public ConsultarTarjeta consultarTarjeta;

    @objid ("aee6d768-79ed-4c63-9e39-859fd9db2443")
    public RepositorioTarjeta repositorioTarjeta;

    @objid ("f698ddda-39ce-4566-831c-a74b96a9edab")
    public ConsultarTarjetaPortInt(RepositorioTarjeta tarjeta) {
    }

}
