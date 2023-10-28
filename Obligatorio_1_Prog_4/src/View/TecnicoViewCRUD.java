package View;

import Controller.EquipoController;
import Controller.JugadorController;
import Controller.TecnicoController;
import Model.Equipo;
import Model.Jugador;
import Model.Tecnico;

import java.util.Scanner;

public class TecnicoViewCRUD {
    public static void AltaView(){

        int ci;
        String nombre;
        String apellido;
        int partidosGanados;
        int sueldo;
        Equipo equipo;

        while (true) {
            try {
                System.out.println("Creacion de un Tecnico ");


                System.out.println("\nCedula: ");
                Scanner a = new Scanner(System.in);
                ci = a.nextInt();

                System.out.println("\nNombre: ");
                Scanner b = new Scanner(System.in);
                nombre = b.nextLine();

                System.out.println("\nApellido: ");
                Scanner c = new Scanner(System.in);
                apellido = c.nextLine();

                System.out.println("\nCantidad de partidos ganados: ");
                Scanner d = new Scanner(System.in);
                partidosGanados = d.nextInt();

                System.out.println("\nSueldo: ");
                Scanner e = new Scanner(System.in);
                sueldo = e.nextInt();

                Tecnico unT=new Tecnico(ci, nombre,apellido, null, partidosGanados,sueldo);

                System.out.println("Esta de acuardo con estos datos? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int salir = s.nextInt();
                if (salir == 0) {
                    elegirEquipo(unT);
                    TecnicoController.alta(unT);
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
            System.out.println("Tecnico:\n");
            TecnicoController.leer();
            try {
                System.out.println("Escribra el numero del Tecnico a eliminar ");
                id = s.nextInt();

                System.out.println("Esta de acuerdo con eliminar este Tecnico? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    TecnicoController.baja(id);
                    break;
                }
            }catch (Exception e){
                System.out.println("Error al eliminar, incerte de nuevo los datos  "+e);
            }
        }
    }
    public static void ModificarView(){
        int ci;
        String nombre;
        String apellido;
        int partidosGanados;
        int sueldo;
        Equipo equipo;
        int id;

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Tecnico:\n");
            TecnicoController.leer();
            try {
                System.out.println("Escribra la id del Tecnico a modificar ");
                Scanner a = new Scanner(System.in);
                id = a.nextInt();

                System.out.println("Esta modificando el Tecnico");

                System.out.println("\nCI: ");
                Scanner b = new Scanner(System.in);
                ci = b.nextInt();

                System.out.println("\nNombre: ");
                Scanner n = new Scanner(System.in);
                nombre = n.nextLine();

                System.out.println("\nApellido: ");
                Scanner ap = new Scanner(System.in);
                apellido = ap.nextLine();

                System.out.println("\nCantidad de partidos ganados: ");
                Scanner pg = new Scanner(System.in);
                partidosGanados = pg.nextInt();

                System.out.println("\nSueldo: ");
                Scanner su = new Scanner(System.in);
                sueldo = su.nextInt();

                Tecnico unT = new Tecnico(ci, nombre, apellido, null,partidosGanados,sueldo);

                System.out.println("Esta de acuardo con los datos? (1:no|0:si)");
                int salir = s.nextInt();
                if (salir == 0) {
                    elegirEquipo(unT);
                    TecnicoController.modificar(TecnicoController.Encontrar(id), unT);
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error al crear, incerte de nuevo los datos " + e);
            }
        }
    }


    private static void elegirEquipo(Tecnico unT){
        while (true){

            System.out.println("Elegir el equipo que dirigira el Tecnico");
            EquipoController.leer();
            try{
                Scanner u = new Scanner(System.in);
                int idEquipo = u.nextInt();
                unT.setEquipo(EquipoController.Encontrar(idEquipo));

                System.out.println("Esta de acuerdo con los datos ingresados? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int sali = s.nextInt();
                if(sali == 0){
                    break;
                }
            }catch (Exception e){
                System.out.println("Error al crear, incerte de nuevo los datos "+ e);
            }
        }
    }
    public static void LeerView(){

        Scanner s = new Scanner(System.in);
        try{
            while (true){
                System.out.println("Todos los Tecnicos: ");
                System.out.println("Tecnico:");
                TecnicoController.leer();
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
