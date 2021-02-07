package Domain;

import Domain.Entities.Administrador;
import Domain.Entities.Cuenta;

public interface logeo {
    
    boolean ExistenciaLoginEmail(String email, String contraseña);


    void RegistrarAdministracion(Administrador admin);


    void Registar(Cuenta cuenta);

}
