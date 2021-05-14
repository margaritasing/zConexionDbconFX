package org.example.entidades;
public class Cliente {
    private Integer idCliente;
    private String nombre;
    private String cargo;
    private String empresa;
    private String telefono;
    private String mail;

    public Cliente(String nombre, String cargo, String empresa) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.empresa = empresa;
    }

    public Cliente(Integer idCliente, String nombre, String cargo, String empresa) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.cargo = cargo;
        this.empresa = empresa;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", telefono='" + telefono + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}