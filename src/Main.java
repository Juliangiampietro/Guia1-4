import model.ItemVenta;
import service.ItemVentaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    ItemVentaService itemVentaService = new ItemVentaService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 1 para crear un Item:" + "Ingrese 2 para mostrar un Item" + "Ingrese 3 para modificar un Item" + "");
        scanner.nextInt();
        int opcion=2;


        switch (opcion){

            case 1:{

                System.out.println("Usted eligió la opcion 1.");

                break;

            }

            case 2:{

                System.out.println("Usted eligió la opcion 2.");

                break;

            }

            case 3:{

                System.out.println("Usted eligió la opcion 3.");

                break;

            }

            default: {

                System.out.println("Opcion incorrecta");

            }

        }


    }
}