package Domain.Entities;



public class CuentaEmpresa {
 
    public String Login;

    public int id_cuentas;
    public String email;

 
    public String password;

    public CuentaEmpresa(String Login, String email, String password) {
        this.Login = Login;
        this.email = email;
        this.password = password;
    }

    public CuentaEmpresa() {
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getEmail() {
        return email;
    }

    public int getId_cuentas() {
        return id_cuentas;
    }

    public void setId_cuentas(int id_cuentas) {
        this.id_cuentas = id_cuentas;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 
}
