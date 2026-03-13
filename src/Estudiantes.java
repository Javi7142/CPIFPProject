import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
    private String nombre;
    private String identificador;
    private Cpifp cpifp;
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();

    public Cpifp getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    public void setCpifp(final Cpifp value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

    public List<Modulo> getListaModulos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulos;
    }

    public void setListaModulos(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulos = value;
    }

}
