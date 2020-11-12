
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Pedido {
    
    private int id_pedido;
    private int tipo_doc;
    private Vendedor ven;
    private Cliente clien;
    private int fecha;
    private String con_pago;

    public Pedido(int id_pedido, int tipo_doc, Vendedor ven, Cliente clien, int fecha, String con_pago) {
        this.id_pedido = id_pedido;
        this.tipo_doc = tipo_doc;
        this.ven = ven;
        this.clien = clien;
        this.fecha = fecha;
        this.con_pago = con_pago;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", tipo_doc=" + tipo_doc + ", ven=" + ven + ", clien=" + clien + ", fecha=" + fecha + ", con_pago=" + con_pago + '}';
    }

   
   
}
