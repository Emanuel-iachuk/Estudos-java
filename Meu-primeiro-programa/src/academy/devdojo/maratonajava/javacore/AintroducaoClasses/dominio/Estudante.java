package academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio;

public class Estudante {
    // Campos/atributos públicos da classe
    public String nome;
    public int idade;
    public char sexo;

    // Construtor padrão - executa quando criamos new Estudante()
    public Estudante(){
        this.nome = "Anonimo";  // Define nome padrão
        this.idade = 18;        // Define idade padrão
        this.sexo = 'M';        // Define sexo padrão
    }

    // Método que retorna String formatada com dados do estudante
    public String getEstudante() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo;
    }
}
