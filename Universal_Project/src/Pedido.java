
import java.util.ArrayList;
import javax.swing.JOptionPane;


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

   public void CrearPedido(){
       
   Pedido p1 = new Pedido(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite id pedido:")), 
           Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Tipo documento:")), ven, prod, clien, fecha, total, con_pago);
    
       
   
}

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", tipo_doc=" + tipo_doc + ", ven=" + ven + ", prod=" + prod + ", clien=" + clien + ", fecha=" + fecha + ", total=" + total + ", con_pago=" + con_pago + '}';
    }
    
}
