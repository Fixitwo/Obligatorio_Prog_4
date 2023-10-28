package View;

import Controller.ArbitroController;
import Model.Arbitro;

import java.util.Scanner;

public class ArbitroViewCRUD {
    public static void AltaView(){
        int ci;
        String nombre;
        String apellido;
        int cantPartDir;
        int aniosTrabaj;
        int sueldo;


        while (true) {
            try {
                System.out.println("Creacion de un ARBITRO ");

                System.out.println("\nCedula: ");
                Scanner a = new Scanner(System.in);
                ci = a.nextInt();

                System.out.println("\nNombre: ");
                Scanner b = new Scanner(System.in);
                nombre = b.nextLine();

                System.out.println("\nApellido: ");
                Scanner c = new Scanner(System.in);
                apellido = c.nextLine();

                System.out.println("\nCantidad de partidos dirigidos: ");
                Scanner d = new Scanner(System.in);
                cantPartDir = d.nextInt();

                System.out.println("\nCantidad de años trabajados: ");
                Scanner e = new Scanner(System.in);
                aniosTrabaj = e.nextInt();

                System.out.println("\nCantidad de años trabajados: ");
                Scanner f = new Scanner(System.in);
                sueldo = f.nextInt();

                Arbitro unA = new Arbitro(ci, nombre, apellido, cantPartDir,aniosTrabaj,sueldo);

                System.out.println("Esta de acuardo con estos datos? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int salir = s.nextInt();
                if(salir == 0){
                    ArbitroController.alta(unA);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error al crear, incerte de nuevo los datos ");
            }

        }
    }
    public static void BajaView(){
        int ci;
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Arbitros:\n");
            ArbitroController.leer();
            try {
                System.out.println("Escribra la cedula del arbitro a eliminar ");
                ci = s.nextInt();

                System.out.println("Esta de acuerdo con eliminar este Arbitro? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    ArbitroController.baja(ci);
                    break;
                }
            }catch (Exception e){
                System.out.println("Error al eliminar, incerte de nuevo los datos  "+e);
            }

        }

    }
    public static void ModificarView(){
        int ci;
        int newCi;
        String nombre;
        String apellido;
        int cantPartDir;
        int aniosTrabaj;
        int sueldo;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Arbitros:\n");
            ArbitroController.leer();
            try {
                System.out.println("Escribra la cedula del arbitro a modificar ");
                Scanner a = new Scanner(System.in);
                ci = a.nextInt();

                System.out.println("Esta modificando el ARBITRO");

                System.out.println("\nCedula: ");
                Scanner z = new Scanner(System.in);
                newCi = z.nextInt();

                System.out.println("\nNombre: ");
                Scanner b = new Scanner(System.in);
                nombre = b.nextLine();

                System.out.println("\nApellido: ");
                Scanner c = new Scanner(System.in);
                apellido = c.nextLine();

                System.out.println("\nCantidad de partidos dirigidos: ");
                Scanner d = new Scanner(System.in);
                cantPartDir = d.nextInt();

                System.out.println("\nCantidad de años trabajados: ");
                Scanner e = new Scanner(System.in);
                aniosTrabaj = e.nextInt();

                System.out.println("\nCantidad de partidos dirigidos: ");
                Scanner f = new Scanner(System.in);
                sueldo = f.nextInt();

                Arbitro unA = new Arbitro(newCi, nombre, apellido, cantPartDir, aniosTrabaj, sueldo);

                System.out.println("Esta de acuardo con los datos? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    ArbitroController.modificar(ArbitroController.Encontrar(ci),unA);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error al crear, incerte de nuevo los datos "+ e);
            }

        }


    }
    public static void LeerView(){
        Scanner s = new Scanner(System.in);
        try{
            while (true){
                System.out.println("Todos los arbitros ");
                System.out.println("Arbitros:");
                ArbitroController.leer();
                System.out.println("Desea regresar? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Comando desconocido");
        }

    }

}
