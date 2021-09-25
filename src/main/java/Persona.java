/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Persona {
     
        
        String Codigo;
        String Nombre;
        String Apellido; 
        String Sexo; 
        String Dirección;
        String Lugar;
        String Motivo;
        String Medico; 
        String Fecha;

    public Persona() {
        this.Codigo = "";
        this.Nombre = "";
        this.Apellido = "";
        this.Sexo = "";
        this.Dirección = "";
        this.Lugar = "";
        this.Motivo = "";
        this.Medico = "";
        this.Fecha = "";
    }

        
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getMedico() {
        return Medico;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
        
    
}
