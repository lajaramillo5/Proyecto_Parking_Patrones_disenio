package Domain;

import Domain.Entities.CuentaSocio;
import Domain.Entities.Parqueadero;
import Domain.Entities.Reserva;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2e00dcef-4b31-4755-8361-cc6186188a43")
public interface AsignarEstacionamiento {
    @objid ("330c3a55-caa7-4049-8eca-1f54ef255966")
    void RegistrarEspacio(Reserva reserva, CuentaSocio socio, Parqueadero espacio);

    @objid ("40334ce7-7b73-471f-84ef-6899c9bece25")
    void ConsultarEspaciosDisponibles(Parqueadero espacio);

    @objid ("d191ed4c-a71d-4ebe-9b3a-bc63d9babd2f")
    void AsingnarEspacioDisponible(Parqueadero espacio);

    @objid ("418ee3ff-82bf-45a9-b317-f8d7596d0e53")
    void NumerodeHoras(String h_inicio, String h_fin);

}
