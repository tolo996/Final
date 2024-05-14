package edu.jdc.clases;

public class Usuario {

    private Usuario documentoUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String telefono;
    private Roles codRol;

    public Usuario() {
    }

    public Usuario(Usuario documentoUsuario, String nombreUsuario, String apellidoUsuario, String telefono, Roles codRol) {
        this.documentoUsuario = documentoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.telefono = telefono;
        this.codRol = codRol;
    }

    public Usuario getDocumentoUsuario() {
        return documentoUsuario;
    }

    public void setDocumentoUsuario(Usuario documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Roles getCodRol() {
        return codRol;
    }

    public void setCodRol(Roles codRol) {
        this.codRol = codRol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "documentoUsuario=" + documentoUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", telefono=" + telefono + ", codRol=" + codRol + '}';
    }

}