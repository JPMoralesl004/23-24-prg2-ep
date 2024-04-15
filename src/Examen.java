import java.util.ArrayList;
import java.util.List;

public class Examen {
    private String nombre;
    private Profesor profesor_vigilante;
    private String DNI;
    private List<Pregunta> preguntas;
    
    public Examen(String nombre, Profesor profesor_vigilante, String DNI, List<Pregunta> preguntas){
        this.nombre = nombre;
        this.profesor_vigilante = profesor_vigilante;
        this.DNI = DNI;
        this.preguntas = preguntas;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Profesor getProfesorVigilante() {
        return profesor_vigilante;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public List<Pregunta> getPreguntas() {
        if (preguntas == null) {
            preguntas = new ArrayList<>();
        }
        return preguntas;
    }
    
    public void agregarPregunta(Pregunta pregunta) {
        getPreguntas().add(pregunta);
    }
}
