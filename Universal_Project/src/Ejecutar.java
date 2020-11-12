
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
                    Vendedor vend1 = new Vendedor(235, 789, "santi", "cali", "rivera", 963, "calle 62", "santi@", 120389);
                    Cliente cl1 = new Cliente(896, "cris", "pereira", "depart", 8446, "calle11", "sm@", 120996);
                    Pedido ped1 = new Pedido(123, 321, vend1, cl1, 120520,"tc"); 
                    do {
                        opc = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar producto\n" + "2. Salir\n"));
                        switch(opc){
                            case 1:
                                Linea lin = new Linea(8999, "Papeleria");
                                Producto prod1 = new Producto(155, lin, "Lapices", 15, 2500);
                                
                                suma=prod1.totalP();
                                total = total+suma;
                                JOptionPane.showMessageDialog(null, total);
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
