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
                if(EquipoController.noHayEquipo() ){
                    break;
                }else if(ArbitroController.noHayArbitro()){
                    break;
                }

                System.out.println("Creacion de un Partido ");

                System.out.println("Dia: 00");
                Scanner a = new Scanner(System.in);
                String dia = a.nextLine();

                System.out.println("Mes: 00");
                Scanner c = new Scanner(System.in);
                String mes = c.nextLine();

                System.out.println("Anio: 0000");
                Scanner e = new Scanner(System.in);
                String anio = e.nextLine();

                System.out.println("Hora: 00:00");
                Scanner h = new Scanner(System.in);
                String hora = h.nextLine();

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
                System.out.println("Error al crear, incerte de nuevo los datos "+e);
            }
        }
    }
    private static void elegirEquipo(Partido unP){
        while (true){

            System.out.println("Elegir el primer equipo que jugara en el partido");
            EquipoController.leer();
            try{
                Scanner u = new Scanner(System.in);
                int idEquipo = u.nextInt();
                unP.setEquipoPartido(EquipoController.Encontrar(idEquipo));

                System.out.println("Elegir el segundo equipo");

                Scanner h = new Scanner(System.in);
                int idEquipo2 = h.nextInt();
                if(idEquipo ==idEquipo2){
                    throw new Exception("los equipos no pueden ser los mismos");
                }
                unP.setEquipoPartido(EquipoController.Encontrar(idEquipo2));

                if(unP.getEquipoPartido().length() <2){
                    break;
                }
                System.out.println("Esta de acuerdo con los datos ingresados? (1:no|0:si)");
                Scanner s = new Scanner(System.in);
                int sali = s.nextInt();
                if(sali == 0){
                    break;
                }
            }catch (Exception e){
                System.out.println("Error al crear, incerte de nuevo los datos "+ e.getMessage());
            }
        }
    }
    public static void BajaView(){

        int id;
        Scanner s = new Scanner(System.in);
        while (true){
            if(EquipoController.noHayEquipo()){
                break;
            }else if(ArbitroController.noHayArbitro()){
                break;
            }
            System.out.println("Partido:\n");
            PartidoController.leer();
            try {
                System.out.println("Escribra el numero del partido a eliminar o una letra para salir");
                id = s.nextInt();

                System.out.println("Esta de acuerdo con eliminar este Partido? (1:no|0:si)");
                int salir = s.nextInt();
                if(salir == 0){
                    PartidoController.baja(id);
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
        LocalDate fechaPartido;
        LocalTime horaPartido;
        Arbitro arbitro;
        Equipo equipo;

        Scanner s = new Scanner(System.in);

        while (true) {
            if(EquipoController.noHayEquipo()){
                break;
            }else if(ArbitroController.noHayArbitro()){
                break;
            }
            System.out.println("Partido:\n");
            TecnicoController.leer();
            try {
                System.out.println("Escribra la id del Partido a modificar o una letra para salir");
                Scanner a = new Scanner(System.in);
                id = a.nextInt();

                System.out.println("Esta modificando el Partido");

                System.out.println("Dia: 00");
                Scanner z = new Scanner(System.in);
                String dia = z.nextLine();

                System.out.println("Mes: 00");
                Scanner c = new Scanner(System.in);
                String mes = c.nextLine();

                System.out.println("Anio: 0000");
                Scanner e = new Scanner(System.in);
                String anio = e.nextLine();

                System.out.println("Hora: 00:00");
                Scanner h = new Scanner(System.in);
                String hora = h.nextLine();

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
                System.out.println("Saliendo");
                break;
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
