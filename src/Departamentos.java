import java.util.ArrayList;
import java.util.List;

public class Departamentos {
    private String nombre;
    private Cpifp cpifp;
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();
    private List<Profesores> listaProfesores = new ArrayList<Profesores> ();
    private Profesores jefe;

    public void añadirProfesor(final Profesores profesor) {

    }

    public void quitarProfesor(final Profesores profesor) {

    }

    public Profesores getProfesor(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    public List<Profesores> getListaProfesores() {
        // TODO Auto-generated return
        return null;
    }

    public List<Modulo> getListaModulos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulos;
    }

    public void setListaModulos(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulos = value;
    }

    public void setListaProfesores(final List<Profesores> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaProfesores = value;
    }

    public Profesores getJefe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.jefe;
    }

    public void setJefe(final Profesores value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.jefe = value;
    }

}
