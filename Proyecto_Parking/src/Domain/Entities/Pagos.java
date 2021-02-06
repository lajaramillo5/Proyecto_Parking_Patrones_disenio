package Domain.Entities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e03e2a0f-2539-491b-9b24-2da344d2490f")
public class Pagos {
    @objid ("2f53d091-6cb6-40c7-bf1b-f92104bcd154")
    public String monto;

    @objid ("788c1c66-e754-482b-8d27-3b88c1ba99c2")
    public List<PasarelaDepagos> pasarelaDepagos = new ArrayList<PasarelaDepagos> ();

    @objid ("44658eda-aaba-44d2-b89c-25037cb9464b")
    public Reserva reserva;

}
