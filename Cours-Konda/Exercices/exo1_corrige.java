package Exercices;
import java.util.Scanner; 
public class exo1_corrige {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir les deux entiers
        System.out.print("Entrez le premier entier (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier (b) : ");
        int b = scanner.nextInt();

        // Calculer le résultat de l'addition
        int resultat = a + b;

        // Afficher les résultats
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("resultat = a + b");
        System.out.println("resultat vaut " + resultat);

        // Fermer le scanner
        scanner.close();
    }
}