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
@Table(name = "cuentaempresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentaempresa.findAll", query = "SELECT c FROM Cuentaempresa c"),
    @NamedQuery(name = "Cuentaempresa.findByLogin", query = "SELECT c FROM Cuentaempresa c WHERE c.login = :login"),
    @NamedQuery(name = "Cuentaempresa.findByEmail", query = "SELECT c FROM Cuentaempresa c WHERE c.email = :email"),
    @NamedQuery(name = "Cuentaempresa.findByPassword", query = "SELECT c FROM Cuentaempresa c WHERE c.password = :password"),
    @NamedQuery(name = "Cuentaempresa.findByIdCuenta", query = "SELECT c FROM Cuentaempresa c WHERE c.idCuenta = :idCuenta")})
public class Cuentaempresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "login")
    private String login;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Id
    @Basic(optional = false)
    @Column(name = "id_cuenta")
    private Integer idCuenta;

    public Cuentaempresa() {
    }

    public Cuentaempresa(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
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

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCuenta != null ? idCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentaempresa)) {
            return false;
        }
        Cuentaempresa other = (Cuentaempresa) object;
        if ((this.idCuenta == null && other.idCuenta != null) || (this.idCuenta != null && !this.idCuenta.equals(other.idCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistencia.Cuentaempresa[ idCuenta=" + idCuenta + " ]";
    }
    
}
