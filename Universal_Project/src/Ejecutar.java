
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecutar {

    public static void main(String[] args) {
        
        ArrayList<Producto> prod = new ArrayList<>();
        ArrayList<Pedido> ped = new ArrayList<>();
  
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
                    Scanner teclado = new Scanner(System.in);
                    Vendedor vend1 = new Vendedor(235, 789, "santi", "cali", "rivera", 963, "calle 62", "santi@", 120389);
                    Cliente cl1 = new Cliente(896, "cris", "pereira", "depart", 8446, "calle11", "sm@", 120996);
                    Pedido ped1 = new Pedido(123, 321, vend1, prod, cl1, 120520, 2000, "tc"); 
                    do {
                        opc = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar producto\n" + "2. Salir\n"));
                        switch(opc){
                            case 1:
                                Linea lin = new Linea(8999, "Papeleria");
                                Producto prod1 = new Producto(155, lin, "Lapices", 15, 2500);
                                prod.add(prod1);
                                break;
                        }
                    }while(opc !=2);
                    
                    ped.add(ped1);
                    prod.clear();
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    if(!ped.isEmpty()){
                        System.out.println("\n----------------------------\n" + "LISTA DE PEDIDOS");
                        for(int i=0;i<ped.size();i++){
                            System.out.println("\n----------------------------\n" + ped.get(i) +
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
