package View;

import Controller.PartidoController;
import Model.Arbitro;
import Model.Partido;
import Model.Equipo;

import java.time.LocalTime;

public class PartidoViewCRUD {
    public static void AltaView(){
        Arbitro unA = new Arbitro(5323,"juan","Roberto",23);
        LocalTime unHra = LocalTime.parse("08:20");
        Equipo unE = new Equipo("Prueba");
        Partido unP = new Partido(unA,unHra,unE);

        PartidoController.alta(unP);

    }
    public static void BajaView(){
        Arbitro unA = new Arbitro(5323,"juan","Roberto",23);
        LocalTime unHra = LocalTime.parse("08:20");
        Equipo unE = new Equipo("Prueba");
        Partido unP = new Partido(unA,unHra,unE);

        PartidoController.baja(unP);
    }
    public static void ModificarView(){
        Arbitro unA = new Arbitro(5323,"juan","Roberto",23);
        LocalTime unHra = LocalTime.parse("08:20");
        Equipo unE = new Equipo( "Prueba");
        Partido unP = new Partido(unA,unHra,unE);

        PartidoController.modificar(unP);
    }
    public static void LeerView(){
        Arbitro unA = new Arbitro(5323,"juan","Roberto",23);
        LocalTime unHra = LocalTime.parse("08:20");
        Equipo unE = new Equipo("Prueba");
        Partido unP = new Partido(unA,unHra,unE);

        PartidoController.modificar(unP);
    }
}
