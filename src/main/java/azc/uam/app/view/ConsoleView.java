package azc.uam.app.view;

import java.util.Scanner;

public class ConsoleView {
    public void menu(){
        System.out.println("================= PIZZERIA =================");
        System.out.println(" 1 - Pizza Estilo NY");
        System.out.println(" 2 - Pizza Estilo IL");
        System.out.println(" 3 - Salir");
    }

    public int opcion(){
        try{
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            return opcion;
        }
        catch(Exception e){
            return -1;
        }
    }
}
