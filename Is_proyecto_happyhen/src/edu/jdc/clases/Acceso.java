package edu.jdc.clases;

public class Acceso {

    private Usuario DocumentoUsuario;
    private String correoAcceso;
    private String claveAcceso;

    public Acceso() {
    }

    public Acceso(Usuario DocumentoUsuario, String correoAcceso, String claveAcceso) {
        this.DocumentoUsuario = DocumentoUsuario;
        this.correoAcceso = correoAcceso;
        this.claveAcceso = claveAcceso;
    }

    public Usuario getDocumentoUsuario() {
        return DocumentoUsuario;
    }

    public void setDocumentoUsuario(Usuario DocumentoUsuario) {
        this.DocumentoUsuario = DocumentoUsuario;
    }

    public String getCorreoAcceso() {
        return correoAcceso;
    }

    public void setCorreoAcceso(String correoAcceso) {
        this.correoAcceso = correoAcceso;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    @Override
    public String toString() {
        return "Acceso{" + "DocumentoUsuario=" + DocumentoUsuario + ", correoAcceso=" + correoAcceso + ", claveAcceso=" + claveAcceso + '}';
    }

    
}
