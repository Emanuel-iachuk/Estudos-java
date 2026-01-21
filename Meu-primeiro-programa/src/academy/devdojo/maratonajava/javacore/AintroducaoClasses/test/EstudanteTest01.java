package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        // Cria um novo objeto Estudante
        Estudante aluno = new Estudante();

        // Define os dados do aluno
        aluno.nome = "Emanuel";  // Nome do estudante
        aluno.idade = 20;        // Idade em anos
        aluno.sexo = 'M';        // Sexo (M/F)

        // Mostra as informações formatadas do aluno
        System.out.println(aluno.getEstudante());
    }
}
