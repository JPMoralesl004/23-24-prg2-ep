import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("NombredelProfesor", "NIE");

        List<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(new Pregunta("agregar pregunta"));
        preguntas.add(new Pregunta("agregar pregunta"));

        Examen examen = new Examen("Asignatura", profesor, "123456789X", preguntas);

        System.out.println("Detalles del examen:");
        System.out.println("Nombre del examen: " + examen.getNombre());
        System.out.println("Profesor vigilante: " + examen.getProfesorVigilante().getNombre());
        System.out.println("DNI del profesor vigilante: " + examen.getProfesorVigilante().getNIE());
        System.out.println("Preguntas del examen:");
        for (Pregunta pregunta : examen.getPreguntas()) {
            System.out.println("- " + pregunta.getEnunciado());
        }
    }
}
