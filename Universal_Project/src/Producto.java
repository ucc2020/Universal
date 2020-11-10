
public class Producto {
    
    private int cod_producto;
    private Linea lin;
    private String descrip;
    private int cant;
    private double precio;

    public Producto(int cod_producto, Linea lin, String descrip, int cant, double precio) {
        this.cod_producto = cod_producto;
        this.lin = lin;
        this.descrip = descrip;
        this.cant = cant;
        this.precio = precio;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public Linea getLin() {
        return lin;
    }

    public void setLin(Linea lin) {
        this.lin = lin;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod_producto=" + cod_producto + ", lin=" + lin + ", descrip=" + descrip + ", cant=" + cant + ", precio=" + precio + '}';
    }
    
}
