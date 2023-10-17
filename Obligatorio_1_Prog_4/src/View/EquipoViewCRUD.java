package View;

import Controller.EquipoController;
import Controller.JugadorController;
import Controller.TecnicoController;
import Model.Equipo;
import Model.Jugador;

import java.util.Scanner;

public class EquipoViewCRUD {
    public static void AltaView(){
        String nombre;
        Equipo unE;

        while (true) {
            System.out.println("Creacion de un Equipo ");
            try {
                System.out.println("\nNombre: ");
                Scanner b = new Scanner(System.in);
                nombre = b.nextLine();

                unE = new Equipo(nombre);

                System.out.println("Esta de acuardo con estos datos? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int salir = s.nextInt();
                if(salir == 0){
                    EquipoController.alta(unE);
                    elegirJugadores(unE);
                    elegirSuplentes(unE);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error al crear, incerte de nuevo los datos "+ e);
            }

        }

    }
    public static void BajaView(){

        int id;
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Equipos:\n");
            EquipoController.leer();
            try {
                System.out.println("Escribra el numero del Equipo a eliminar ");
                id = s.nextInt();

                System.out.println("Esta de acuerdo con eliminar este Equipo? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    EquipoController.baja(id);
                    break;
                }
            }catch (Exception e){
                System.out.println("Error al eliminar, incerte de nuevo los datos  "+e);
            }

        }
    }
    public static void ModificarView(){
        String nombre;
        int id;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Equipo:\n");
            EquipoController.leer();
            try {
                System.out.println("Escribra la id del Equipo a modificar ");
                Scanner a = new Scanner(System.in);
                id = a.nextInt();

                System.out.println("Esta modificando el Equipo");

                System.out.println("\nNombre: ");
                Scanner b = new Scanner(System.in);
                nombre = b.nextLine();

                Equipo unA = new Equipo(nombre);

                System.out.println("Esta de acuardo con los datos? (1:no|0:si)");
                int salir = s.nextInt();
                if (salir == 0) {
                    EquipoController.modificar(EquipoController.Encontrar(id), unA);
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
                System.out.println("Todos los Equipos: ");
                System.out.println("Equipo:");
                EquipoController.leer();
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
    private static void elegirJugadores(Equipo unE){
        while (true){

            System.out.println("Elegir jugadores para el equipo");
            JugadorController.leer();
            try{
                Scanner u = new Scanner(System.in);
                int idJugador = u.nextInt();
                EquipoController.altaJugador(idJugador,unE);

                System.out.println("jugadores en el equipo ");
                EquipoController.leerJugador(unE);

                System.out.println("Desea seguir agregando jugadores? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int sali = s.nextInt();
                if(sali == 1){
                    break;
                }
            }catch (Exception e){
                System.out.println("Error al crear, incerte de nuevo los datos "+ e);
            }
        }
    }
    private static void elegirSuplentes(Equipo unE){
        while (true){

            System.out.println("Elegir Suplentes para el equipo");
            JugadorController.leer();
            try{
                Scanner u = new Scanner(System.in);
                int idJugador = u.nextInt();
                EquipoController.altaSuplentes(idJugador,unE);

                System.out.println("Suplentes en el equipo ");
                EquipoController.leerSuplentes(unE);

                System.out.println("Desea seguir agregando Suplentes? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int sali = s.nextInt();
                if(sali == 1){
                    break;
                }
            }catch (Exception e){
                System.out.println("Error al crear, incerte de nuevo los datos "+ e);
            }
        }
    }
    private static void elegirTecnico(Equipo unE){
        while (true){

            System.out.println("Elegir Tecnico para el equipo");
            TecnicoController.leer();
            try{
                Scanner u = new Scanner(System.in);
                int idTecnico = u.nextInt();
                EquipoController.altaTecnico(idTecnico,unE);

                System.out.println("El Tecnico es correcto? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int sali = s.nextInt();
                if(sali == 1){
                    break;
                }
            }catch (Exception e){
                System.out.println("Error al crear, incerte de nuevo los datos "+ e);
            }
        }
    }
}
