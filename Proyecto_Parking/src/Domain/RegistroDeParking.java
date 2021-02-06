package Domain;

import Domain.Entities.Parqueadero;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2f298f8c-19a5-4fbc-963d-a810ed91bac2")
public interface RegistroDeParking {
    @objid ("62e369b7-f464-4fad-8279-f1e28f145292")
    void RegistrarParking(Parqueadero agregar);

}
