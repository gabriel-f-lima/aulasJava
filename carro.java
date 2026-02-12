import java.util.Scanner;

public class carro {
    public static void main(String[] args) {
    System.out.println("Vamos calcular o valor do carro");

    Scanner entrada = new Scanner(System.in);
    System.out.println("Qual o valor do carro?");
    double valorCarro = entrada.nextDouble();

    System.out.println("O valor da entrada deve ser de 30% do valor do carro: " + (valorCarro * 0.3));
    System.out.println("Em quantas vezes deseja parcelar o restante do valor do carro?");

    int parcelas = entrada.nextInt();
    double valorParcelas = (valorCarro * 0.7) / parcelas;
    System.out.println("\n");

    System.out.printf("O valor de cada parcela é: %.2f", valorParcelas);
    System.out.println("Porém a cada mes será acrescentado 2,45% de juros sobre o valor total do financiamento\n");

    double valorTotalFinanciamento = (valorCarro * 0.7) + ((valorCarro * 0.7) * 0.0245 * parcelas);
    
    System.out.printf("O valor total do financiamento é: %.2f", valorTotalFinanciamento);
    System.out.printf("\nO valor de cada parcela com juros é: %.2f", valorTotalFinanciamento / parcelas);
    entrada.close();
    }
}
