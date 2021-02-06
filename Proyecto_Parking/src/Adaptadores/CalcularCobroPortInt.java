package Adaptadores;

import Domain.CalcularCobro;
import Domain.Entities.Pagos;
import Persistencia.RepositorioPagos;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2241fad0-d498-41b7-af79-5f3de71992ed")
public class CalcularCobroPortInt {
    @objid ("8927d50f-5ffc-4708-96b3-8ffef96bacf4")
    public CalcularCobro calcularCobro;

    @objid ("4d0558da-df21-4aa4-ae7e-1b1e8d8912bb")
    public RepositorioPagos repositorioPagos;

    @objid ("dc534642-efd8-469a-9c40-ec0833646e64")
    public void RegistrarPago(Pagos pago) {
    }

}
