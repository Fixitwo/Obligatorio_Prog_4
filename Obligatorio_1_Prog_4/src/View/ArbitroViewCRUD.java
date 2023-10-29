package View;

import Controller.ArbitroController;
import Controller.JugadorController;
import Model.Arbitro;

import java.util.Scanner;

public class ArbitroViewCRUD {
    public static void AltaView(){
        int ci;
        String nombre;
        String apellido;
        int cantPartDir;
        int aniosTrabj;

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

                System.out.println("\nAños Trabajados: ");
                Scanner e = new Scanner(System.in);
                aniosTrabj = e.nextInt();

                Arbitro unA = new Arbitro(ci, nombre, apellido, cantPartDir, aniosTrabj);

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
        int id;
        Scanner s = new Scanner(System.in);
        while (true){
            if(ArbitroController.noHayArbitro()){
                break;
            }
            System.out.println("Arbitros:\n");
            ArbitroController.leer();
            try {
                System.out.println("Escribra la id del arbitro a eliminar o una letra para salir");
                id = s.nextInt();

                System.out.println("Esta de acuerdo con eliminar este Arbitro? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    ArbitroController.baja(id);
                    break;
                }
            }catch (Exception e){
                System.out.println("Saliendo");
                break;
            }
        }
    }
    public static void ModificarView(){
        int id;
        int newCi;
        String nombre;
        String apellido;
        int cantPartDir;
        int aniosTrabaj;
        Scanner s = new Scanner(System.in);

        while (true) {
            if(ArbitroController.noHayArbitro()){
                break;
            }
            System.out.println("Arbitros:\n");
            ArbitroController.leer();
            try {
                System.out.println("Escribra la id del arbitro a modificar o una letra para salir");
                Scanner a = new Scanner(System.in);
                id = a.nextInt();

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

                System.out.println("\nAños trabajados: ");
                Scanner e = new Scanner(System.in);
                aniosTrabaj = e.nextInt();

                Arbitro unA = new Arbitro(newCi, nombre, apellido, cantPartDir,aniosTrabaj);

                System.out.println("Esta de acuardo con los datos? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    ArbitroController.modificar(ArbitroController.Encontrar(id),unA);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Saliendo");
                break;
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
