package Domain;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2a46e723-d5b0-437e-918e-5cf0d7b36d1a")
public interface CalcularCobro {
    @objid ("abde4aa8-8abe-4d48-91e8-de80034b498f")
    int CalcularHoras(String Inicio, String fin);

    @objid ("1f4070ae-dc42-4171-8418-7e32cdb92359")
    double CalcularCobro(int horasTotales, double montoXhora);

    @objid ("dfb0fd77-f767-4a4b-952a-c4de6e30361d")
    void CancelarPago(String montoTotal);

}
