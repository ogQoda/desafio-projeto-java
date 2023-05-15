import br.com.acme.desafio.dominio.Curso;
import br.com.acme.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Kotlin", "Curso de Kotlin TQI", 120);
        Curso curso2 = new Curso("Javascript", "Curso de Javascript TQI", 240);

        Mentoria mentoria = new Mentoria("Kotlin Avancado", "Curso de Kotlin Avancado", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Javascript Avancado", "Curso de Javascript Avancado", LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(mentoria2);
    }
}