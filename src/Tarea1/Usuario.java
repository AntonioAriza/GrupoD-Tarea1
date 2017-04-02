/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Eduardo
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Nombre_Usuario;
    private String password;
    private String email;
    private String nombre;
    private int telefno;
    private String descripcion;
    private List<Eventos> asistenciaEventos;
    private List<Eventos> likesEventos;
    private List<Notificación> listaNotificacion;
    private List<Valoración> listaValoraciones;
    private List<Comentarios> listalikes;
    private List<Comentarios> listaComentarios;

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefno() {
        return telefno;
    }

    public void setTelefno(int telefno) {
        this.telefno = telefno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Nombre_Usuario != null ? Nombre_Usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.Nombre_Usuario == null && other.Nombre_Usuario != null) || (this.Nombre_Usuario != null && !this.Nombre_Usuario.equals(other.Nombre_Usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.tarea1.Usuario[ id=" + Nombre_Usuario + " ]";
    }
    
}
