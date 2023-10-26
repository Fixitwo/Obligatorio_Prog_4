package View;

import Controller.EquipoController;
import Controller.PartidoController;
import Controller.TecnicoController;
import Controller.ArbitroController;
import Model.Arbitro;
import Model.Partido;
import Model.Equipo;
import Model.Tecnico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PartidoViewCRUD {
    public static void AltaView(){

        int id;
        LocalDate fechaPartido;
        LocalTime horaPartido;
        Arbitro arbitro;
        Equipo equipo;

        while (true) {
            try {
                System.out.println("Creacion de un Partido ");


                System.out.println("Dia:");
                Scanner a = new Scanner(System.in);
                String dia = a.nextLine();

                System.out.println("Mes:");
                Scanner c = new Scanner(System.in);
                String mes = c.nextLine();

                System.out.println("Anio:");
                Scanner e = new Scanner(System.in);
                String anio = e.nextLine();

                System.out.println("Hora: 00:00");
                Scanner h = new Scanner(System.in);
                String hora = e.nextLine();

                fechaPartido = LocalDate.parse(anio+"-"+mes+"-"+dia);

                horaPartido= LocalTime.parse(hora);

                Partido unP=new Partido(null, fechaPartido ,horaPartido, null);

                System.out.println("Esta de acuardo con estos datos? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int salir = s.nextInt();
                if (salir == 0) {
                    elegirArbitro(unP);
                    elegirEquipo(unP);
                    PartidoController.alta(unP);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error al crear, incerte de nuevo los datos ");
            }
        }
    }
    private static void elegirEquipo(Partido unP){
        while (true){

            System.out.println("Elegir el equipo que jugaran en el partido");
            EquipoController.leer();
            try{
                Scanner u = new Scanner(System.in);
                int idEquipo = u.nextInt();
                unP.setEquipoPartido(EquipoController.Encontrar(idEquipo));

                System.out.println("Elegir el segundo equipo");

                Scanner h = new Scanner(System.in);
                int idEquipo2 = h.nextInt();
                unP.setEquipoPartido(EquipoController.Encontrar(idEquipo2));

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
    public static void BajaView(){

        int id;
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Partido:\n");
            PartidoController.leer();
            try {
                System.out.println("Escribra el numero del partido a eliminar ");
                id = s.nextInt();

                System.out.println("Esta de acuerdo con eliminar este Partido? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    PartidoController.baja(id);
                    break;
                }
            }catch (Exception e){
                System.out.println("Error al eliminar, incerte de nuevo los datos  "+e);
            }
        }
    }
    public static void ModificarView(){
        int id;
        LocalDate fechaPartido;
        LocalTime horaPartido;
        Arbitro arbitro;
        Equipo equipo;

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Partido:\n");
            TecnicoController.leer();
            try {
                System.out.println("Escribra la id del Partido a modificar ");
                Scanner a = new Scanner(System.in);
                id = a.nextInt();

                System.out.println("Esta modificando el Partido");

                System.out.println("Dia:");
                Scanner z = new Scanner(System.in);
                String dia = z.nextLine();

                System.out.println("Mes:");
                Scanner c = new Scanner(System.in);
                String mes = c.nextLine();

                System.out.println("Anio:");
                Scanner e = new Scanner(System.in);
                String anio = e.nextLine();

                System.out.println("Hora: 00:00");
                Scanner h = new Scanner(System.in);
                String hora = e.nextLine();

                fechaPartido = LocalDate.parse(anio+"-"+mes+"-"+dia);

                horaPartido= LocalTime.parse(hora);

                Partido unP=new Partido(null, fechaPartido ,horaPartido, null);

                System.out.println("Esta de acuardo con los datos? (1:no|0:si)");
                int salir = s.nextInt();
                if (salir == 0) {
                    elegirArbitro(unP);
                    elegirEquipo(unP);
                    PartidoController.modificar(PartidoController.Encontrar(id), unP);
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
                System.out.println("Todos los Partidos: ");
                System.out.println("Partido:");
                PartidoController.leer();
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


    private static void elegirArbitro(Partido unP){
        while (true){

            System.out.println("Elegir el Arbitro que dirigira el Partido");
            ArbitroController.leer();
            try{
                Scanner u = new Scanner(System.in);
                int idArbitro = u.nextInt();
                unP.setArbitroPartido(ArbitroController.Encontrar(idArbitro));

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

}
