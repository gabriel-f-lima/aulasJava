import java.util.Scanner;
public class entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu primeiro nome?");
        String nome = entrada.nextLine();
        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Você tem " + idade + " anos.");

        entrada.close();
    }
}
