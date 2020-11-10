
public class Cliente extends Persona{
    
    private int id_cliente;

    public Cliente(int id_cliente, String nombre, String ciudad, String barrio, int telefono, String direccion, String correo, int fech_ingreso) {
        super(nombre, ciudad, barrio, telefono, direccion, correo, fech_ingreso);
        this.id_cliente = id_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + '}';
    }
    
}
