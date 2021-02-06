package Domain.Entities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ba6ade57-3101-4ac7-b1c3-3a9a4b99bc59")
public class Cuenta {
    @objid ("13cdeebf-add5-4e38-b9bf-3f331570582d")
    private String login;

    @objid ("02b10b36-278a-4058-bb05-aadee714f71c")
    private String password;

    @objid ("35987d76-5a52-417d-80c5-523620e2f8c1")
    private String email;

    @objid ("ddd03c71-8b7e-4a4e-aa7c-753a861622dc")
    String getLogin() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.login;
    }

    @objid ("c36f2112-029d-44d4-92dd-714fa38e22fd")
    void setLogin(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.login = value;
    }

    @objid ("ffddf772-d539-4605-b5df-97bb2c42244a")
    String getPassword() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.password;
    }

    @objid ("4f2f5fc1-2dbb-4717-be96-2a7b38a18e28")
    void setPassword(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.password = value;
    }

    @objid ("97c0eabc-9569-4cb5-9495-f4bfb3b7f262")
    String getEmail() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.email;
    }

    @objid ("334f00b1-e117-4d4f-9a1c-5854fb62cf19")
    void setEmail(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.email = value;
    }

}
