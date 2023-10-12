public class Arbitro extends Persona{
    private int cantPartDir;

    //Metodos de Acceso
    public int getCantPartDir(){
        return cantPartDir;
    }
    public void setCantPartDir(int cantPartDir){
        this.cantPartDir=cantPartDir;
    }

    //Constructor
    public Arbitro(int ci, String nombre, String apellido, int cantPartDir){
        super(ci, nombre, apellido);
        this.cantPartDir=cantPartDir;
    }

    //Metodos y Funciones
    @Override
    public void alta() {

    }

    @Override
    public void baja() {

    }

    @Override
    public void modificar() {

    }

    @Override
    public void leer() {

    }
}
