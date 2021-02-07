package Domain;

import Domain.Entities.CuentaSocio;
import Domain.Entities.Parqueadero;
import Domain.Entities.Reserva;

public interface AsignarEstacionamiento {
    
    void RegistrarEspacio(Reserva reserva, CuentaSocio socio, Parqueadero espacio);

  
    void ConsultarEspaciosDisponibles(Parqueadero espacio);


    void AsingnarEspacioDisponible(Parqueadero espacio);


    void NumerodeHoras(String h_inicio, String h_fin);

}
