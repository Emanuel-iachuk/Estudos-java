package academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio;

public class Carro {

    public String nome;
    public String modelo;
    public int ano;

    public Carro(){
        this.nome = "vazio";
        this.modelo = "vazio";
        this.ano = 1234;
    }

    public String getCarro(){
        return "Nome: " + nome + "\nModelo: " +modelo+"\nAno: "+ano;
    }

}
