
package pilas;

public class Asignatura {
    private String codigo;
    private String numeroGrupo;
    private String nombre;
    private String duracion;
    private String cantidadCreditos;

    public Asignatura(String codigo, String numeroGrupo, String nombre, String duracion, String cantidadCreditos) {
        this.codigo = codigo;
        this.numeroGrupo = numeroGrupo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.cantidadCreditos = cantidadCreditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(String numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCantidadCreditos() {
        return cantidadCreditos;
    }

    public void setCantidadCreditos(String cantidadCreditos) {
        this.cantidadCreditos = cantidadCreditos;
    }
    
    

    
}
