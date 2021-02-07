package Domain.Entities;

import java.util.ArrayList;
import java.util.List;

public class CuentaSocio {
 
    private String numerotarjeta;

   
    private float Saldo;


    public List<Vehículo> vehículo = new ArrayList<Vehículo> ();

    public String getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public List<Vehículo> getVehículo() {
        return vehículo;
    }

    public void setVehículo(List<Vehículo> vehículo) {
        this.vehículo = vehículo;
    }
    float getSaldo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Saldo;
    }

   
    void setSaldo(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Saldo = value;
    }

}
