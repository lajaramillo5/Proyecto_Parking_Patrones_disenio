package Domain.UseCase;

import Domain.Entities.Parqueadero;
import Domain.RegistroDeParking;
import Persistencia.OperationDBParking;

public class RegistrarParking implements RegistroDeParking {

    OperationDBParking oper;

    public RegistrarParking(OperationDBParking oper) {
        this.oper = oper;
    }

    @Override
    public int RegistrarPaqueadero(Parqueadero parking) {
        Parqueadero objcue = new Parqueadero();
        int id = oper.GetAll().size();
        //insertar cuenta
        Persistencia.Parqueadero objCuenta = new Persistencia.Parqueadero();
        objCuenta.setNombre(parking.getNombre());
        objCuenta.setDireccion(parking.getDirección());
        objCuenta.setIdParqueadero(id+1);
        objCuenta.setNumeroespacios(parking.getEstacionamiento().NumeroDeEspacios);

        oper.Insertar(objCuenta);

        return 1;
    }
}
