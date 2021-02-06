package Domain.Entities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("eafe6f86-62ae-4fed-a603-58d7c5c95816")
public class CuentaSocio {
    @objid ("3daa35fe-7fe8-4b03-92b2-deea40b7b5bb")
    private String numero tarjeta;

    @objid ("d6ae107f-45c1-48a5-bff3-4b5e97ef1b88")
    private float Saldo;

    @objid ("468b83f2-98a6-431f-ace1-ef9138d33b36")
    public List<Vehículo> vehículo = new ArrayList<Vehículo> ();

    @objid ("9996676c-cabf-47e3-b336-05755baf96f7")
    String getNumero tarjeta() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numero tarjeta;
    }

    @objid ("aa98b110-defa-4947-9023-e7b6604753a5")
    void setNumero tarjeta(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numero tarjeta = value;
    }

    @objid ("915dacb2-8c80-4d95-a275-a8f2f5a3312b")
    float getSaldo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Saldo;
    }

    @objid ("1544019f-2849-4a6e-bdff-0b84f990812f")
    void setSaldo(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Saldo = value;
    }

}
