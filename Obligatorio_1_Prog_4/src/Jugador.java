public class Jugador extends Persona{

    private int pos;
    private String equipo;
    private int cantMinJug;

    //Metodos de Acceso

    public int getPos(){
        return pos;
    }
    public String getEquipo(){
        return equipo;
    }
    public int getCantMinJug(){
        return cantMinJug;
    }

    public void setPos(int pos){
        this.pos=pos;
    }
    public void setEquipo(String equipo){
        this.equipo=equipo;
    }
    public void setCantMinJug(int cantMinJug){
        this.cantMinJug=cantMinJug;
    }

    //Constructor
    public Jugador(int ci, String nombre, String apellido, int pos, String equipo, int cantMinJug){
        super(ci, nombre, apellido);
        this.pos=pos;
        this.equipo=equipo;
        this.cantMinJug=cantMinJug;
    }

    //Metodos y funciones

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
