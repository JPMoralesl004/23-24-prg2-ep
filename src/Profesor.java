public class Profesor {
    private String nombre;
    private String NIE;
    
    public Profesor(String nombre, String NIE){
        this.nombre = nombre;
        this.NIE = NIE;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getNIE() {
        return NIE;
    }
}