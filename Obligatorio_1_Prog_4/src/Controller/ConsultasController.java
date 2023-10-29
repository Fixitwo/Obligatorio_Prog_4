package Controller;

import Model.Arbitro;
import Model.Jugador;
import Model.Tecnico;

import java.util.ArrayList;

public class ConsultasController {
    public static void calculoSueldoJugador(){
        ArrayList <Jugador> lista = Jugador.getListaJugador();
        for (Jugador jug: lista) {
            jug.setSueldoPrima(jug.getSueldoBase()+0.20* jug.getSueldoBase());
            System.out.println("Nombre: " + jug.getNombre() +"\nApellido: " + jug.getApellido() +"\nSueldo con Prima del 20%: $" + jug.getSueldoPrima());
        }
    }
    public static void calculoSueldoTecnico(){
        ArrayList <Tecnico> lista=Tecnico.getListaTecnico();
        for (Tecnico tec:lista) {
            if (tec != null) {
                if (tec.getPartidosGanados() >= 3) {
                    tec.setSueldoPrima(tec.getSueldoBase() + 0.10 * tec.getSueldoBase());
                    System.out.println("Nombre: " + tec.getNombre() + "\nApellido: " + tec.getApellido() + "\nSueldo con Prima del 10%: $" + tec.getSueldoPrima());
                }
            }
        }
    }
    public static void calculoSueldoArbitro(){
        ArrayList <Arbitro> lista=Arbitro.getListaArbitro();
        for (Arbitro arb:lista) {
            if (arb.getAniosTrabj()>5){
                for (int i = 1; i < arb.getAniosTrabj(); i++) {
                    arb.setSueldoPrima(arb.getSueldoBase()+ (0.03*arb.getAniosTrabj()) * arb.getSueldoBase());
                }
                System.out.println("Nombre: " + arb.getNombre() +"\nApellido: " + arb.getApellido() +"\nSueldo con Prima del 3% por cada año trabajado: $" + arb.getSueldoPrima());
            }
        }
    }

}
