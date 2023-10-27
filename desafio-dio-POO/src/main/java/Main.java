import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("Informações dev Arthur:\n");

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Arthur: " + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("Conteúdos Inscritos Arthur: " + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Arthur: " + devArthur.getConteudosConcluidos());
        System.out.println("XP: " + devArthur.calcularTotalXp());

        System.out.println("-------------------------");

        System.out.println("Informações dev Filipe:\n");

        Dev devFilipe = new Dev();
        devFilipe.setNome("Filipe");
        devFilipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Filipe: " + devFilipe.getConteudosInscritos());
        devFilipe.progredir();
        System.out.println("Conteúdos Inscritos Filipe: " + devFilipe.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Filipe: " + devFilipe.getConteudosConcluidos());
        System.out.println("XP: " + devFilipe.calcularTotalXp());
    }
}
