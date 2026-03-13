import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7f6c8734-4a2a-4a8e-bd6b-90289921058c")
public class Modulo {
    @objid ("33969b46-4039-41f9-b556-057721555eec")
    private String nombre;

    @objid ("327ec566-6b6d-47a1-a8e2-61a2a0f6506e")
    private String identificador;

    @objid ("a87427f3-d2ff-44fe-bea1-8b3e615bdf78")
    private List<Profesores> listaProfesores = new ArrayList<Profesores> ();

    @objid ("e6b04d16-4ec7-4a5f-bae8-70aaab51890b")
    private Departamentos listaDepartamentos;

    @objid ("a101c636-01b4-46a0-a0ed-f744dc3d2dc4")
    private List<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes> ();

    @objid ("de46282f-ce01-4f45-984c-3568c0870876")
    public List<Profesores> getListaProfesores() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaProfesores;
    }

    @objid ("59f3187d-124c-473d-ad10-12e64c24aeb1")
    public void setListaProfesores(final List<Profesores> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaProfesores = value;
    }

    @objid ("f25e2edd-b62b-4a7d-87b9-b28eb52c1fed")
    public Departamentos getListaDepartamentos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaDepartamentos;
    }

    @objid ("d9559dc0-1b58-4a94-babf-2a83f3982cbd")
    public void setListaDepartamentos(final Departamentos value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaDepartamentos = value;
    }

}
