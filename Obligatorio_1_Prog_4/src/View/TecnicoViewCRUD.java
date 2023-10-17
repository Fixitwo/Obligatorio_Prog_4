package View;

import Controller.TecnicoController;
import Model.Equipo;
import Model.Tecnico;

public class TecnicoViewCRUD {
    public static void AltaView(){
        Equipo unE = new Equipo("Prueba");
        Tecnico unT = new Tecnico(3242343,"jose","antonio",unE);

        TecnicoController.alta(unT);

    }
    public static void BajaView(){
        Equipo unE = new Equipo("Prueba");
        Tecnico unT = new Tecnico(3242343,"jose","antonio",unE);

        TecnicoController.baja(unT);
    }
    public static void ModificarView(){
        Equipo unE = new Equipo("Prueba");
        Tecnico unT = new Tecnico(3242343,"jose","antonio",unE);

        TecnicoController.modificar(unT);
    }
    public static void LeerView(){
        Equipo unE = new Equipo("Prueba");
        Tecnico unT = new Tecnico(3242343,"jose","antonio",unE);

        TecnicoController.modificar(unT);
    }
}
