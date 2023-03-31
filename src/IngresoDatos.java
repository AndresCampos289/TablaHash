
import Vista.frmPrincipal;


public class IngresoDatos {

int codigo;
String nombre;
frmPrincipal VistaPrincipal;
    

    public IngresoDatos(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void IngresarDatos(int cod, String nom){
        this.VistaPrincipal.btnIngresar(cod, nom);
        this.VistaPrincipal.txtCodigo.getText();
        this.VistaPrincipal.txtNombre.getText();
    }
}
