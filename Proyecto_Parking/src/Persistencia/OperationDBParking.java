package Persistencia;

import Domain.Entities.Parqueadero;
public interface OperationDBParking {

    public int  Insertar(Parqueadero parking);

    void GetAll();

}
