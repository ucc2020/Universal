
public class Persona {
    
    private String nombre;
    private String ciudad;
    private String barrio;
    private int telefono;
    private String direccion;
    private String correo;
    private int fech_ingreso;

    public Persona(String nombre, String ciudad, String barrio, int telefono, String direccion, String correo, int fech_ingreso) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fech_ingreso = fech_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getFech_ingreso() {
        return fech_ingreso;
    }

    public void setFech_ingreso(int fech_ingreso) {
        this.fech_ingreso = fech_ingreso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", barrio=" + barrio + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", fech_ingreso=" + fech_ingreso + '}';
    }
    
}
