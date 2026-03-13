import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2ae73480-f67b-42ed-83ef-32a89eaf9592")
public class Departamentos {
    @objid ("07d5ebc2-b245-4c52-87a8-64cd17200d5a")
    private String nombre;

    @objid ("dc918209-1b64-4673-9b2a-051eacca504a")
    private Cpifp cpifp;

    @objid ("741ff48a-05b4-4416-9b35-fa06fff8f567")
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();

    @objid ("bfca9e2b-ad2a-41ed-bb0b-f3365d73b944")
    private List<Profesores> listaProfesores = new ArrayList<Profesores> ();

    @objid ("8bf87076-515d-45f4-b23e-9623c3df07ab")
    private Profesores jefe;

    @objid ("c96f5abc-17c2-4029-85d5-fba84d01052b")
    public void añadirProfesor(final Profesores p1) {
    }

    @objid ("5b1dc012-05c1-4640-9f15-80bf3d2b25a2")
    public void quitarProfesor(final Profesores p1) {
    }

    @objid ("0ef36e19-2167-4057-b64d-35cb8a9fb247")
    public Profesores getProfesor(final String nombre) {
        // TODO Auto-generated return
        return null;
    }

    @objid ("44a591f0-4980-4d29-821b-9110148c22e2")
    public List<Profesores> getListaProfesores() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("ba24e873-9854-4af7-818c-a42c0a01be4d")
    public List<Modulo> getListaModulos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulos;
    }

    @objid ("c08c1409-f641-4ec6-a949-67548640fe82")
    public void setListaModulos(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulos = value;
    }

    @objid ("24ce1fc4-80fa-4e85-9838-765229f82d2c")
    public void setListaProfesores(final List<Profesores> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaProfesores = value;
    }

    @objid ("f4f93bef-aca0-4b86-8346-28cbda7ea190")
    public Profesores getJefe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.jefe;
    }

    @objid ("4cc8bb3d-b638-4d64-9c67-4359cb911ce3")
    public void setJefe(final Profesores value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.jefe = value;
    }

}
