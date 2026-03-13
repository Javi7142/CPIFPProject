import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6d9990b9-7e30-41b5-915f-24aa8676c7c3")
public class Estudiantes {
    @objid ("1acc4c71-c14b-4aa0-8842-263d793ad099")
    private String nombre;

    @objid ("6bb6360a-3764-4987-87cd-33e064af1dc5")
    private String identificador;

    @objid ("1f9a338f-85a6-489d-bc6f-3ac9a86f8a46")
    private Cpifp cpifp;

    @objid ("d03003ab-c859-44db-87d8-ef79490d89f3")
    private List<Modulo> listaModulos = new ArrayList<Modulo> ();

    @objid ("6275970b-8947-49f8-a017-99941f82424b")
    public Cpifp getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    @objid ("349bcfa2-b3d3-4cba-a9d8-7d5f6ce70e06")
    public void setCpifp(final Cpifp value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

    @objid ("6bf37392-648d-4dab-abbb-7a404295ad82")
    public List<Modulo> getListaModulos() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.listaModulos;
    }

    @objid ("f660a50f-90fa-4a8f-a8c1-9de1c42137d3")
    public void setListaModulos(final List<Modulo> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.listaModulos = value;
    }

}
