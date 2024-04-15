import java.util.List;

public class Asignatura {
    private String materia;
    private Profesor profesor;
    private Examen examen;

    public Asignatura(String asignatura, Profesor profesor, Examen examen){
        this.materia = asignatura;
        this.profesor = profesor;
        this.examen = examen;
    }
    
    public String getMateria() {
        return materia;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }
    
    public Examen getExamen() {
        return examen;
    }
}
