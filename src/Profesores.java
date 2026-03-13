import java.util.ArrayList;
import java.util.List;

public class Profesores {
    private String nombre;
    private String especialidad;
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();
    private Departamentos listaDepartamentos;
    private Departamentos esJefe;
    public Departamentos getEsJefe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.esJefe;
    }

    public void setEsJefe(final Departamentos value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.esJefe = value;
    }

}
