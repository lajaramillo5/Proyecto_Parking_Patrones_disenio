package Domain.Entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    public String codigo;

    public String nombre;

    public String Dirección;

    public Empresa(String codigo, String nombre, String Dirección) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Dirección = Dirección;
    }

    public Empresa() {
    }

    public List<CuentaEmpresa> cuentaEmpresa = new ArrayList<CuentaEmpresa>();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public List<CuentaEmpresa> getCuentaEmpresa() {
        return cuentaEmpresa;
    }

    public void setCuentaEmpresa(List<CuentaEmpresa> cuentaEmpresa) {
        this.cuentaEmpresa = cuentaEmpresa;
    }

   
}
