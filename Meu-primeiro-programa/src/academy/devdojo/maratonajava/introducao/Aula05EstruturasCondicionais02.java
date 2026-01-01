package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 15;
        //Armazenara o valor que for impostos
        String categoria;

        //Cobre todas as possibilidades
        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade < 18) {
            categoria = "Categoria juvenil";
        }else {
            categoria = "Categoria adulta";
        }
        //Imprime a categoria no final
        System.out.println(categoria);
    }
}
