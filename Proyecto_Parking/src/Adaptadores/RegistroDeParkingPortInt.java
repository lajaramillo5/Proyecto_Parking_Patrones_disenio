package Adaptadores;

import Domain.Entities.Parqueadero;
import Persistencia.OperationDBParking;




public class RegistroDeParkingPortInt {

   RegistroDeParkingPortInt resgistro;
    OperationDBParking operation;

    public RegistroDeParkingPortInt(RegistroDeParkingPortInt resgistro, OperationDBParking operation) {
        this.resgistro = resgistro;
        this.operation = operation;
    }



    public int RegistroDeParkingPortInt(Parqueadero parking) {
        return this.operation.Insertar(parking);
    }

}
