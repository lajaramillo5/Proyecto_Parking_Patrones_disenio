package Persistencia;

import java.util.List;

public interface OperationDBParking {

    public int  Insertar(Parqueadero parking);

    public List<Parqueadero> GetAll();

}
