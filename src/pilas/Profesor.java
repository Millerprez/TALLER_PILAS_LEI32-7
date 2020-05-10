
package pilas;

public class Profesor {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String asignatura;

    public Profesor(String cedula, String nombres, String apellidos, String asignatura) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.asignatura = asignatura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
}
