import java.util.Scanner;

public class lavalava {
    public static void main(String args[]) {
        System.out.println("Lava Lava é um sistema automazitado de lavagem de roupas, onde você escolhe o tipo de lavagem, a quantidade de roupas e o sistema calcula o valor total");
        System.out.println("Quantas camisetas deseja lavar? O valor unitario é de R$ 3,99");
        Scanner entrada = new Scanner(System.in);
        int qtdeCamisetas = entrada.nextInt();

        System.out.println("Quantas camisas socias você deseja lavar? O valor unitario é de R$ 9,99");
        int qtdeCamisasSociais = entrada.nextInt();

        System.out.println("Quantas calças jeans você deseja lavar? O valor unitario é de R$ 16,99");
        int qtdeCalcasJeans = entrada.nextInt();

        System.out.println("Quantas calças sociais você deseja lavar? O valor unitario é de R$ 22,99");
        int qtdeCalcasSociais = entrada.nextInt();

        System.out.println("Quantos vestidos deseja lavar? O valor unitario é de R$ 17,99");
        int qtdeVestidos = entrada.nextInt();

        System.out.println("Quantas Calças legging deseja lavar? O valor unitario é de R$ 12,99");
        int qtdeCalcasLegging = entrada.nextInt();

        double valorRoupas = (qtdeCamisetas * 3.99) + (qtdeCamisasSociais * 9.99) + (qtdeCalcasJeans * 16.99) + (qtdeCalcasSociais * 22.99) + (qtdeVestidos * 17.99) + (qtdeCalcasLegging * 12.99);
        System.out.println("\n");
        System.out.println("O valor do sabão é cobrado a parte");
        System.out.println("\n");
        System.out.println("Você tem 3 opções de sabão em pó disponíveis: O OMO custa R$14,99, o Tixan custa R$ 8,99 e o Brilhante custa R$ 11,99");

        System.out.println("Qual sabão você deseja comprar? Digite 1 para OMO, 2 para Tixan e 3 para Brilhante");
        int opcaoSabao = entrada.nextInt();
        double valorSabao = 0.00;

        if (opcaoSabao == 1) {

            valorSabao = 14.99;

        } else if (opcaoSabao == 2){

            valorSabao = 8.99;

        } else if (opcaoSabao == 3){

            valorSabao = 11.99;

        } else {

            System.out.println("Opção inválida escolha umas das opções disponíveis");

        }

        double valorTotal = valorRoupas + valorSabao;

        System.out.println("\n");
        System.out.println("O amaciante tem um valor fixo de R$ 16,99 e é incluso no valor total");
        valorTotal = valorTotal + 16.99;
        System.out.println("\n");
        System.out.printf("O valor total da lavagem é: R$ %.2f%n", valorTotal);
        entrada.close();
    }

}

