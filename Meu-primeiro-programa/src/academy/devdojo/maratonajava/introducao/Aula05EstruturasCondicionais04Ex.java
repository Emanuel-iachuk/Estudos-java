package academy.devdojo.maratonajava.introducao;


/**
 * Calcula imposto de renda progressivo brasileiro com 3 faixas etárias
 * Exemplo: R$100.000 → aplica 9,7% até R$34.712 + 37,35% até R$68.507 + 49,5% no excedente
 */
public class Aula05EstruturasCondicionais04Ex {
    public static void main(String[] args) {
        // Salário bruto anual usado no exemplo (R$100.000)
        double salarioAnual = 100000;

        // Variável que vai armazenar o TOTAL do imposto calculado
        double valorImposto;

        // FAIXA 1: Até R$34.712 → 9,70% SOBRE TODO O VALOR
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * 0.0970;  // 9,70% simples

            // FAIXA 2: R$34.713 até R$68.507 → 9,70% na 1ª faixa + 37,35% no excedente
        } else if (salarioAnual <= 68507) {
            // 1ª FAIXA COMPLETA (fixa) + EXCEDENTE na 2ª faixa
            valorImposto = 34712 * 0.0970 + (salarioAnual - 34712) * 0.3735;

            // FAIXA 3: Acima R$68.507 → 9,70% + 37,35% + 49,50% no excedente final
        } else {
            // 1ª FAIXA COMPLETA + 2ª FAIXA COMPLETA + EXCEDENTE na 3ª faixa
            valorImposto = 34712 * 0.0970              // FAIXA 1: R$3.371,18
                    + (68507 - 34712) * 0.3735    // FAIXA 2: R$12.631,97
                    + (salarioAnual - 68507) * 0.4950; // FAIXA 3: R$15.599,70
        }

        // Calcula salário LIQUIDO (bruto - imposto)
        double sobraSalario = salarioAnual - valorImposto;

        // Mostra resultado formatado com 2 casas decimais
        System.out.printf("O valor do imposto é: R$ %.2f\n", valorImposto);
        System.out.printf("Sobra salarial: R$ %.2f\n", sobraSalario);
    }
}
