import java.util.Scanner;

public class InventarioNoel {
    public static void main(String[] args) {
        //
        String[] inventario = {"ducales", "festival", "tosh", null, null};
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        //
        while (opcion != 4) {
            System.out.println("===================");
            System.out.println("1. Listar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Agregar producto");
            System.out.println("4. cerrar Menu");
            System.out.println("===================");
            //
            opcion = leer.nextInt();
            //
            switch (opcion) {
                case 1:
                    System.out.println("1. Listar Producto");
                    for (String producto : inventario) {
                        if (producto != null) {
                            System.out.println(producto);
                        }
                    }
                    break;
                case 2:
                    System.out.printl("Nombre del producto a buscar:  ");
                    System.out.printl("(Todo en minuscula y sin caracteres especiales)")
                case 3:
                case 4:
            }
        }
    }
}
