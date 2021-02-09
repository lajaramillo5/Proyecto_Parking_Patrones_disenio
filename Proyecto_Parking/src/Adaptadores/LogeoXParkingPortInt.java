package Adaptadores;

import Domain.Entities.Parqueadero;
import Domain.RegistroDeParking;
import Persistencia.OperationDBParking;





public class LogeoXParkingPortInt {

   RegistroDeParking resgistro;
    OperationDBParking operation;

    public LogeoXParkingPortInt(RegistroDeParking resgistro, OperationDBParking operation) {
        this.resgistro = resgistro;
        this.operation = operation;
    }



    public int RegistroDeParkingPortInt(Parqueadero parking) {
        return this.resgistro. RegistrarPaqueadero(parking);
    }

}
