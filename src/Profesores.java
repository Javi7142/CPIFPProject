import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cc36f097-3e20-44ea-aacf-5328db528b41")
public class Profesores {
    @objid ("06bc4192-6120-45b2-90b8-bc4c17d25313")
    private String nombre;

    @objid ("03b11f73-a3bc-452d-bab6-53e2db27b7c7")
    private String especialidad;

    @objid ("7f733bc8-f15c-40d9-a6c5-9cca71bf79ae")
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();

    @objid ("7d695cb3-43fd-4371-9db9-9ad6d6fd9663")
    private Departamentos listaDepartamentos;

    @objid ("2c2f473c-7bf9-4e33-95fc-91a737b162cc")
    private Departamentos esJefe;

    @objid ("c97a3a48-a9ef-4f26-aa43-5fe7a3bc248e")
    public Profesores(final String nombre, final String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @objid ("eb59ba8b-d6c3-4b5a-bc0e-7505360861bf")
    public Departamentos getEsJefe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.esJefe;
    }

    @objid ("498b2963-7efd-4eb0-ab59-2c885e9636c6")
    public void setEsJefe(final Departamentos value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.esJefe = value;
    }

    @Override
    public String toString() {
        return String.format("nombre: %s, especialidad: %s", nombre, especialidad);
    }

    
}
