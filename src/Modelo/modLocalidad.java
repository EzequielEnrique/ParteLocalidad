/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author TheDr
 */
public class modLocalidad {
    int idLocalidad;
    String locNombre;
    String locCP;
    int provinciaID;

    public modLocalidad() {
    }

    public modLocalidad(int idLocalidad, String locNombre, String locCP, int provinciaID) {
        this.idLocalidad = idLocalidad;
        this.locNombre = locNombre;
        this.locCP = locCP;
        this.provinciaID = provinciaID;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getLocNombre() {
        return locNombre;
    }

    public void setLocNombre(String locNombre) {
        this.locNombre = locNombre;
    }

    public String getLocCP() {
        return locCP;
    }

    public void setLocCP(String locCP) {
        this.locCP = locCP;
    }

    public int getProvinciaID() {
        return provinciaID;
    }

    public void setProvinciaID(int provinciaID) {
        this.provinciaID = provinciaID;
    }
    
}




