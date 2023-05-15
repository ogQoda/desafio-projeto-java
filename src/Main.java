import br.com.acme.desafio.dominio.*;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer TQI");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("DevCarlos conteudos inscritos: " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println(" -- ");
        System.out.println("DevCarlos conteudos inscritos: " + devCarlos.getConteudosInscritos());
        System.out.println("DevCarlos conteudos concluidos: " + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());

        System.out.println("----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("DevJoao conteudos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(" -- ");
        System.out.println("DevJoao conteudos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("DevJoao conteudos concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());



//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

    }
}