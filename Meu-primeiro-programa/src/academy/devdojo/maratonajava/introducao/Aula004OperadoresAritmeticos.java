package academy.devdojo.maratonajava.introducao;

public class Aula004OperadoresAritmeticos {
    // Principais operadores Aritiméticos são:
    // + - * /

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 34;

        System.out.println("Valor: "+(n1 * n2));

        //Operador de resto representado pela %
        int resto = 10 % 3;

        System.out.println(resto);

        // Operadores logicos sempre vão retornar um valor booleano eles são:
        // <, >, <=, >=, ==, !=

        if (10 > 12)System.out.println(">"); // falso
        if (10 < 12)System.out.println("<"); // verdadeiro
        if (10 == 12)System.out.println("=="); // falso
        if (10 != 12)System.out.println("!="); // verdadeiro
        if (10 >= 12)System.out.println(">="); // falso
        if (10 <= 12)System.out.println("<="); // verdadeiro

        // Outros operadores lógicos são:
        // && (AND) Ambas devem ser verdadeiras;
        // || (or) Somente uma precisa ser verdadeira;
        // ! (Not) Inverte o valor;

        boolean a = false;
        boolean b = true;

        System.out.println(a && b); // false (AND: Ambas verdadeiras);
        System.out.println(a || b); // true (Or: Somente uma verdadeira);
        System.out.println(!b); // false (NOT: inverte);





    }
}
