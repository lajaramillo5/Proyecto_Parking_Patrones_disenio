package Domain.Use Case;

import Domain.AsignarEstacionamiento;
import Domain.Entities.CuentaSocio;
import Domain.Entities.Parqueadero;
import Domain.Entities.Reserva;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("71b87f3a-f708-47ac-8c51-70d7b9129c4a")
public class Asignar Espacio implements AsignarEstacionamiento {
    @objid ("2c97de1f-a726-4079-935e-095eec9915b0")
    public Parqueadero parqueadero;

    @objid ("5831e0c5-c669-4cdf-a621-ac82e2fe24c3")
    public void RegistrarEspacio(Reserva reserva, CuentaSocio socio, Parqueadero espacio) {
    }

    @objid ("3d5fb64a-0fdd-4b8a-ad03-704098be22c7")
    public void ConsultarEspaciosDisponibles(Parqueadero espacio) {
    }

    @objid ("ffc4a048-d74c-47be-a56d-785c2afcc6fa")
    public void AsingnarEspacioDisponible(Parqueadero espacio) {
    }

    @objid ("41948f7b-2674-436a-9748-55317268f199")
    public void NumerodeHoras(String h_inicio, String h_fin) {
    }

}
