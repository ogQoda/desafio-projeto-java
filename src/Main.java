import br.com.acme.desafio.dominio.Conteudo;
import br.com.acme.desafio.dominio.Curso;
import br.com.acme.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Kotlin");
        curso.setDescricao("Curso de Kotlin TQI");
        curso.setCargaHorario(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Curso de Javascript TQI");
        curso2.setCargaHorario(240);

        Conteudo curso3 = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Kotlin Avancado");
        mentoria.setDescricao("Curso de Kotlin Avancado");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

    }
}