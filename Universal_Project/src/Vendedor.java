
public class Vendedor extends Persona {
    
    private int cod_vend;
    private int id;

    public Vendedor(int cod_vend, int id, String nombre, String ciudad, String barrio, int telefono, String direccion, String correo, int fech_ingreso) {
        super(nombre, ciudad, barrio, telefono, direccion, correo, fech_ingreso);
        this.cod_vend = cod_vend;
        this.id = id;
    }

    public int getCod_vend() {
        return cod_vend;
    }

    public void setCod_vend(int cod_vend) {
        this.cod_vend = cod_vend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "cod_vend=" + cod_vend + ", id=" + id + '}';
    }
    
}
