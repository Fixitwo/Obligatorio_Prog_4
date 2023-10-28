package View;

import Controller.ArbitroController;
import Controller.EquipoController;
import Controller.JugadorController;
import Model.Arbitro;
import Model.Equipo;
import Model.Jugador;

import java.util.Scanner;

public class JugadorViewCRUD {
    public static void AltaView(){

        int ci;
        String nombre;
        String apellido;
        int pos;
        int cantMinJug;
        int sueldo;

        while (true) {
            try {
                System.out.println("Creacion de un Jugador ");


                System.out.println("\nCedula: ");
                Scanner a = new Scanner(System.in);
                ci = a.nextInt();

                System.out.println("\nNombre: ");
                Scanner b = new Scanner(System.in);
                nombre = b.nextLine();

                System.out.println("\nApellido: ");
                Scanner c = new Scanner(System.in);
                apellido = c.nextLine();

                System.out.println("\nPosicion: ");
                Scanner d = new Scanner(System.in);
                pos = d.nextInt();

                System.out.println("\nCantidad de minutos jugados: ");
                Scanner e = new Scanner(System.in);
                cantMinJug = e.nextInt();

                System.out.println("\nSueldo: ");
                Scanner f = new Scanner(System.in);
                sueldo = f.nextInt();

                Jugador unJ = new Jugador(ci, nombre, apellido, pos, cantMinJug,sueldo);

                System.out.println("Esta de acuardo con estos datos? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int salir = s.nextInt();
                if (salir == 0) {
                    JugadorController.alta(unJ);
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
        while (true) {
            System.out.println("Jugadores:\n");
            JugadorController.leer();
            try {
                System.out.println("Escribra el numero del Jugador a eliminar ");
                id = s.nextInt();

                System.out.println("Esta de acuerdo con eliminar este Jugador? (1:no|0:si)");
                int salir = s.nextInt();
                if (salir == 0) {
                    JugadorController.baja(id);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error al eliminar, incerte de nuevo los datos  " + e);
            }
        }
    }
    public static void ModificarView(){

        int ci;
        int id;
        String nombre;
        String apellido;
        int pos;
        int cantMinJug;
        int sueldo;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Jugador:\n");
            JugadorController.leer();
            try {
                System.out.println("Escribra la id del Jugador a modificar ");
                Scanner a = new Scanner(System.in);
                id = a.nextInt();

                System.out.println("Esta modificando el Jugador");

                System.out.println("\nCedula: ");
                Scanner z = new Scanner(System.in);
                ci = z.nextInt();

                System.out.println("\nNombre: ");
                Scanner b = new Scanner(System.in);
                nombre = b.nextLine();

                System.out.println("\nApellido: ");
                Scanner c = new Scanner(System.in);
                apellido = c.nextLine();

                System.out.println("\nPosicion: ");
                Scanner d = new Scanner(System.in);
                pos = d.nextInt();

                System.out.println("\nCantidad de minutos jugados: ");
                Scanner e = new Scanner(System.in);
                cantMinJug = e.nextInt();

                System.out.println("\nSueldo: ");
                Scanner f = new Scanner(System.in);
                sueldo = f.nextInt();

                Jugador unA = new Jugador(ci, nombre, apellido, pos,cantMinJug, sueldo);

                System.out.println("Esta de acuardo con los datos? (1:no|0:si)");
                int salir = s.nextInt();
                if (salir == 0) {
                    JugadorController.modificar(JugadorController.Encontrar(id), unA);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error al crear, incerte de nuevo los datos " + e);
            }
        }
    }
    public static void LeerView(){

        Scanner s = new Scanner(System.in);
        try{
            while (true){
                System.out.println("Todos los Jugadores: ");
                System.out.println("Jugador:");
                JugadorController.leer();
                System.out.println("Desea regresar? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Comando desconocido "+ e);
        }
    }
}
