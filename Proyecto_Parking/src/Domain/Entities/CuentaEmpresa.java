package Domain.Entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("09d5d999-ae97-447a-916d-264ab410c9e3")
public class CuentaEmpresa {
    @objid ("bd513359-7044-4319-8557-d99c0d0d50e5")
    private String Login;

    @objid ("6dc447b9-a6ac-4100-8193-156e8f326c57")
    private String email;

    @objid ("84777810-8ce6-40c8-b77d-0d214da94d4a")
    private String password;

    @objid ("7ed235c2-fdf9-4438-9d8d-16929e5c4482")
    String getLogin() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Login;
    }

    @objid ("753a378a-e602-489d-8a23-f2c1d7c6fe33")
    void setLogin(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Login = value;
    }

    @objid ("944450a0-f46f-4783-97fe-c9e23bd21513")
    String getEmail() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.email;
    }

    @objid ("e941df05-47a2-4fe0-b3d5-3c9efe56bad5")
    void setEmail(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.email = value;
    }

    @objid ("17df5061-b5f2-4398-bb5c-6cdc173cf7be")
    String getPassword() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.password;
    }

    @objid ("3f4c081f-cff4-4961-af3d-375d3cc88e4f")
    void setPassword(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.password = value;
    }

}
