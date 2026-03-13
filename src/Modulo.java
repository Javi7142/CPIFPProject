import java.util.ArrayList;
import java.util.List;

public class Modulo {
    private String nombre;
    private String identificador;
    private List<Profesores> listaProfesores = new ArrayList<Profesores> ();
    private Departamentos departamento;
    private List<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes> ();

    public List<Profesores> getListaProfesores() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaProfesores;
    }

    public void setListaProfesores(final List<Profesores> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaProfesores = value;
    }

}
