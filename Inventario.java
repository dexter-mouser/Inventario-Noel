import java.util.Scanner;

public class Inventario-Noel {
    public static void main(String[] args) {
        //
        String[] inventario = {"Ducales","Festival","Tosh",null,null};
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        //
        while (opcion != 4) {
            Sysout.println("===================");
            Sysout.println("1. Listar producto");
            Sysout.println("2. Buscar producto");
            Sysout.println("3. Agregar producto");
            Sysout.println("4. cerrar Menu");
            Sysout.println("===================");
            //
            opcion = leer.nextInt();
            leer.nextInt();
            //
            Switch (opcion) 
        }
    }
}
