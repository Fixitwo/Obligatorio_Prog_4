import java.time.LocalTime;
import java.util.*;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {


        //ingresar fecha
        System.out.println("Dia:");
        Scanner a = new Scanner(System.in);
        String dia = a.nextLine();

        System.out.println("Mes:");
        Scanner c = new Scanner(System.in);
        String mes = c.nextLine();

        System.out.println("Anio:");
        Scanner e = new Scanner(System.in);
        String anio = e.nextLine();

        LocalDate date = LocalDate.parse(anio+"-"+mes+"-"+dia);

        consoleClear();
        System.out.println("Fecha "+ date);

        //ingresar hora
        LocalTime ltObject3 = LocalTime.parse("08:20");
        System.out.println("ltObject3 = " + ltObject3);

    }
    private static void consoleClear(){
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
    }
}