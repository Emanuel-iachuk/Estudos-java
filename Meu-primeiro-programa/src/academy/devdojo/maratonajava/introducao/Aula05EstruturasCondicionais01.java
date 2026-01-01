package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizada = false;  // "Autorizada" (feminino correto)

        // OR: basta UMA condição ser verdadeira
        if (idade >= 18 || isAutorizada) {
            System.out.println("✅ Aprovado!");
        } else {
            System.out.println("❌ Não autorizado");
        }

        // AND seria: idade >= 18 && isAutorizada
        // NOT: !isAutorizada (inverte boolean)

        // Esse if sera exetudo mesmo que o priemeiro não seja;
        if (!isAutorizada) {
            System.out.println("Você é menor acompanhado! 👶");
        }
    }
}
