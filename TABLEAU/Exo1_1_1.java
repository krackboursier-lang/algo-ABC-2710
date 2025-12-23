
import java.util.Scanner;

public class Exo1_1_1 {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner lecteur = new Scanner(System.in);

        System.out.println("Programme de calcul de la moyenne de 2 nombres.");
        System.out.print("Veuillez saisir 2 nombres séparés par un espace : ");

        // Vérification que les deux prochaines entrées sont bien des entiers
        if (lecteur.hasNextInt()) {
            int nb1 = lecteur.nextInt();
            if (lecteur.hasNextInt()) {
                int nb2 = lecteur.nextInt();

                // Calcul de la moyenne en utilisant 2.0 pour forcer le résultat en double
                double moyenne = (nb1 + nb2) / 2.0;

                // Affichage du résultat
                System.out.printf("La moyenne de %d et %d est : %.1f%n", nb1, nb2, moyenne);
            } else {
                System.out.println("Erreur : Le deuxième nombre saisi n'est pas un entier.");
            }
        } else {
            System.out.println("Erreur : Le premier nombre saisi n'est pas un entier.");
        }

        // Simulation de "Appuyez sur une touche pour quitter"
        System.out.println("Appuyez sur Entrée pour quitter.");
        lecteur.nextLine(); // Consomme le retour à la ligne restant
        lecteur.nextLine(); // Attend la pression de la touche Entrée

        // Fermeture du Scanner
        lecteur.close();
    }
}
