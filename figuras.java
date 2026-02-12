import java.util.Scanner;
public class figuras {
   public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o raio do círculo?");
        double raio = entrada.nextDouble();
        double areaCirculo = 3.14 * (raio * raio);
        System.out.println("A área do círculo é: " + areaCirculo);
        System.out.printf("%s%.2f", "A área do círculo é: ", areaCirculo);
    
        entrada.close();
   }
}