/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Smart
 */
@Entity
@Table(name = "parqueadero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parqueadero.findAll", query = "SELECT p FROM Parqueadero p")
    , @NamedQuery(name = "Parqueadero.findByNombre", query = "SELECT p FROM Parqueadero p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Parqueadero.findByDireccion", query = "SELECT p FROM Parqueadero p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Parqueadero.findByNumeroespacios", query = "SELECT p FROM Parqueadero p WHERE p.numeroespacios = :numeroespacios")
    , @NamedQuery(name = "Parqueadero.findByCodigoEmpresa", query = "SELECT p FROM Parqueadero p WHERE p.codigoEmpresa = :codigoEmpresa")
    , @NamedQuery(name = "Parqueadero.findByIdParqueadero", query = "SELECT p FROM Parqueadero p WHERE p.idParqueadero = :idParqueadero")})
public class Parqueadero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "numeroespacios")
    private Integer numeroespacios;
    @Column(name = "codigoEmpresa")
    private String codigoEmpresa;
    @Id
    @Basic(optional = false)
    @Column(name = "id_parqueadero")
    private Integer idParqueadero;

    public Parqueadero() {
    }

    public Parqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumeroespacios() {
        return numeroespacios;
    }

    public void setNumeroespacios(Integer numeroespacios) {
        this.numeroespacios = numeroespacios;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public Integer getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParqueadero != null ? idParqueadero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parqueadero)) {
            return false;
        }
        Parqueadero other = (Parqueadero) object;
        if ((this.idParqueadero == null && other.idParqueadero != null) || (this.idParqueadero != null && !this.idParqueadero.equals(other.idParqueadero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistencia.Parqueadero[ idParqueadero=" + idParqueadero + " ]";
    }
    
}
