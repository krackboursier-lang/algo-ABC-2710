import java.util.Scanner;

public class Exo1_1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double nombre1;
        double nombre2;
        double moyenne;

        System.out.print("Veuillez saisir un premier nombre : ");
        
        nombre1 = scanner.nextDouble();

        System.out.print("Veuillez saisir un second nombre : ");
        nombre2 = scanner.nextDouble();

        moyenne = (nombre1 + nombre2) / 2.0;

        System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est : " + moyenne);

        scanner.close();
    }
}