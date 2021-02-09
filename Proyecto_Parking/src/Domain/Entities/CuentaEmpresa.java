package Domain.Entities;

public class CuentaEmpresa {

    public String Login;

    public int id_cuentas;
    public String email;
    Empresa empresa;

    public String password;

    public CuentaEmpresa(String Login, String email, String password, Empresa empresa) {
        this.Login = Login;
        this.id_cuentas = id_cuentas;
        this.email = email;
        this.empresa = empresa;
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

    public int getId_cuentas() {
        return id_cuentas;
    }

    public void setId_cuentas(int id_cuentas) {
        this.id_cuentas = id_cuentas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}
