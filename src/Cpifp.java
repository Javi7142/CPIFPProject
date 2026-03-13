import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("df9941bd-76ae-46be-909d-98c8280bec59")
public class Cpifp {
    @objid ("0a910c7e-647c-462a-8a45-b1db00e4a347")
    private String nombre;

    @objid ("5389daed-ae9e-4bf9-819e-2355fe5746ef")
    private String direccion;

    @objid ("f1688dd3-bf13-4665-a29b-8ad2dda2b6c3")
    private String telefono;

    @objid ("2cc1b927-679e-410c-9aa0-56757837093e")
    private List<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes> ();

    @objid ("6b5e28c1-4279-4619-ba1d-8a0f1f0aa603")
    private List<Departamentos> listaDepartamentos = new ArrayList<Departamentos> ();

    @objid ("1f78e1a2-44ec-4b26-9ae0-aa0bb27583d6")
    public void añadirEstudiante(final Estudiantes p1) {
    }

    @objid ("4881ceda-0185-4e88-af37-bb6aa23bb752")
    public void añadirDepartamento(final Departamentos p1) {
    }

    @objid ("e45f4dd8-88f6-4d1c-8144-b88dc36fb107")
    public void quitarEstudiante(final Estudiantes p1) {
    }

    @objid ("6dd3a635-439b-4674-94bd-95bc3df750eb")
    public void quitarDepartamento(final Departamentos p1) {
    }

    @objid ("7b966388-24ae-4ecf-a825-16e2003682e0")
    public Estudiantes getEstudiante(final String identificador) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("6257da6e-cc66-4e5c-bf06-f02cf3201aee")
    public Departamentos getDepartamento(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("0d014d77-a649-44c0-be49-4081a9ca588b")
    public List<Estudiantes> getListaEstudiantes() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("764ed6f0-a553-4d80-a60c-d42150f94fd1")
    public List<Departamentos> getListaDepartamentos() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("31494456-01cf-4c9c-9b88-f746165270c7")
    public void setListaDepartamentos(final List<Departamentos> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaDepartamentos = value;
    }

}
