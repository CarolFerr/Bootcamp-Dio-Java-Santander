import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();
        
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(120);

        curso2.setTitulo("Curso Javascriptt");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(90);

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("descrição da mentoria do curso de Java ");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Mentoria de Javascript");
        mentoria2.setDescricao("descrição da mentoria do curso de Javascript ");
        mentoria2.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Ana: " + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("Conteudos Inscritos Ana: " + devAna.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ana: " + devAna.getConteudosConcluidos());
        System.out.println("Quantidade de XPs obtidos: " + devAna.calcularTotalXP());
        System.out.println("========================================================================================");
        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("Conteudos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Carlos: " + devCarlos.getConteudosConcluidos());
        System.out.println("Quantidade de XPs obtidos: " + devCarlos.calcularTotalXP());


        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Decricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);
//        System.out.println(mentoria2);
    }
}

