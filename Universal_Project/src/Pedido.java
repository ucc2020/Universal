
import java.util.ArrayList;


public class Pedido {
    
    private int id_pedido;
    private int tipo_doc;
    private Vendedor ven;
    private ArrayList<Producto> prod;
    private Cliente clien;
    private int fecha;
    private float total;
    private String con_pago;

    public Pedido(int id_pedido, int tipo_doc, Vendedor ven, ArrayList<Producto> prod, Cliente clien, int fecha, float total, String con_pago) {
        this.id_pedido = id_pedido;
        this.tipo_doc = tipo_doc;
        this.ven = ven;
        this.prod = prod;
        this.clien = clien;
        this.fecha = fecha;
        this.total = total;
        this.con_pago = con_pago;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(int tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public Vendedor getVen() {
        return ven;
    }

    public void setVen(Vendedor ven) {
        this.ven = ven;
    }

    public ArrayList<Producto> getProd() {
        return prod;
    }

    public void setProd(ArrayList<Producto> prod) {
        this.prod = prod;
    }

    public Cliente getClien() {
        return clien;
    }

    public void setClien(Cliente clien) {
        this.clien = clien;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getCon_pago() {
        return con_pago;
    }

    public void setCon_pago(String con_pago) {
        this.con_pago = con_pago;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", tipo_doc=" + tipo_doc + ", ven=" + ven + ", prod=" + prod + ", clien=" + clien + ", fecha=" + fecha + ", total=" + total + ", con_pago=" + con_pago + '}';
    }
    
}
