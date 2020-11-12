
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecutar {
    ArrayList<String> listaPed;
    ArrayList<String> listaProd;

    public static void main(String[] args) {
        
       Ejecutar miLista = new Ejecutar();
       miLista.listaPed = new ArrayList();
       Ejecutar miLista2 = new Ejecutar();
       miLista2.listaProd = new ArrayList();
        int opcion =0;
        int opc =0;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "1.Agregar pedido\n"
            + "2.Eliminar Pedido\n"
            + "3.Mostrar pedidos realizados\n"
            + "4.Salir\n"
            + "Que desea hacer?"));
            switch(opcion){
                
                case 1:
                    double suma;
                    double total= 0;
                    String a,b;
                                
                    Scanner teclado = new Scanner(System.in);
                    JOptionPane.showMessageDialog(null, "Digitar Datos Vendedor");
                    Vendedor vend1 = new Vendedor(Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo de Vendedor")),
                             Integer.parseInt(JOptionPane.showInputDialog("Digite ID Vendedor")), 
                             JOptionPane.showInputDialog("Digite Nombre Vendedor"), 
                             JOptionPane.showInputDialog("Digite Ciudad"), 
                             JOptionPane.showInputDialog("Digite Barrio"), 
                             Integer.parseInt(JOptionPane.showInputDialog("Digite Telefono")), 
                             JOptionPane.showInputDialog("Digite Direccion"), 
                             JOptionPane.showInputDialog("Digite Correo"),
                             Integer.parseInt(JOptionPane.showInputDialog("Digite Fecha Ingreso")));
                    JOptionPane.showMessageDialog(null, "Digitar Datos Cliente");
                    Cliente cl1 = new Cliente(Integer.parseInt(JOptionPane.showInputDialog("Digite ID Cliente")),
                            JOptionPane.showInputDialog("Digite Nombre Cliente"), 
                            JOptionPane.showInputDialog("Digite Ciudad"),
                            JOptionPane.showInputDialog("Digite Barrio"), 
                            Integer.parseInt(JOptionPane.showInputDialog("Digite Telefono")),
                            JOptionPane.showInputDialog("Digite Direccion"),
                            JOptionPane.showInputDialog("Digite Correo"), 
                            Integer.parseInt(JOptionPane.showInputDialog("Digite Fecha Ingreso")));
                    JOptionPane.showMessageDialog(null, "Crear Pedido");
                    Pedido ped1 = new Pedido(Integer.parseInt(JOptionPane.showInputDialog("Digite ID Pedido")),
                            JOptionPane.showInputDialog("Digite Tipo Pedido"), vend1, cl1, 
                            Integer.parseInt(JOptionPane.showInputDialog("Digite Fecha Pedido")),
                            JOptionPane.showInputDialog("Digite Condicion Pago")); 
                    do {
                        opc = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar producto\n" + "2. Salir\n"));
                        switch(opc){
                            case 1:
                                Linea lin = new Linea(Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo Linea")),
                                JOptionPane.showInputDialog("Digite Nombre Linea"));
                                Producto prod1 = new Producto(Integer.parseInt(JOptionPane.showInputDialog("Digite ITEM")), lin, 
                                       JOptionPane.showInputDialog("Digite Descripcion Producto"),
                                       Integer.parseInt(JOptionPane.showInputDialog("Digite La cantidad")) , 
                                       Double.parseDouble(JOptionPane.showInputDialog("Valor UND Producto")));
                                
                                suma=prod1.totalP();
                                total = total+suma;
                               
                                a=prod1.toString()+total;
                                miLista2.listaProd.add(a);
                                break;
                        }
                    }while(opc !=2);
                    
                    b=ped1.toString()+miLista2.listaProd;
                    miLista.listaPed.add(b);
                    miLista2.listaProd.clear();
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    if(!miLista.listaPed.isEmpty()){
                        System.out.println("\n----------------------------\n" + "LISTA DE PEDIDOS");
                        for(int i=0;i<miLista.listaPed.size();i++){
                            System.out.println("\n----------------------------\n" + miLista.listaPed.get(i) +
                                               "\n----------------------------\n");
                        }
                    }else{
                        System.out.println("No hay pedidos");
                    }
                    break;       
            }     
        }while(opcion !=4);
    }
}
