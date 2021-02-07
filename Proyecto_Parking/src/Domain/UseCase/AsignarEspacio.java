package Domain.UseCase;

import Domain.AsignarEstacionamiento;
import Domain.Entities.CuentaSocio;
import Domain.Entities.Parqueadero;
import Domain.Entities.Reserva;

public class AsignarEspacio implements AsignarEstacionamiento {

    public Parqueadero parqueadero;


    public void RegistrarEspacio(Reserva reserva, CuentaSocio socio, Parqueadero espacio) {
    }


    public void ConsultarEspaciosDisponibles(Parqueadero espacio) {
    }


    public void AsingnarEspacioDisponible(Parqueadero espacio) {
    }


    public void NumerodeHoras(String h_inicio, String h_fin) {
    }

}
