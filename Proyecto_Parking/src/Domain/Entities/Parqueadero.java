package Domain.Entities;

import java.util.ArrayList;
import java.util.List;

public class Parqueadero {

    public int id_parqueadero;

    private String Nombre;

    private String Dirección;
    public List<Administrador> administrador = new ArrayList<Administrador>();

    public List<Empresa> empres = new ArrayList<Empresa>();

    public Parqueadero(String Nombre, String Dirección, Estacionamiento estacionamiento) {
        this.id_parqueadero = id_parqueadero;
        this.Nombre = Nombre;
        this.Dirección = Dirección;
        this.estacionamiento = estacionamiento;
    }

    public Parqueadero() {
    }

    public int getId_parqueadero() {
        return id_parqueadero;
    }

    public void setId_parqueadero(int id_parqueadero) {
        this.id_parqueadero = id_parqueadero;
    }

    public List<Empresa> getEmpres() {
        return empres;
    }

    public void setEmpres(List<Empresa> empres) {
        this.empres = empres;
    }

    public Estacionamiento estacionamiento;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public List<Administrador> getAdministrador() {
        return administrador;
    }

    public void setAdministrador(List<Administrador> administrador) {
        this.administrador = administrador;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

}
