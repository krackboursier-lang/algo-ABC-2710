
    import java.util.Scanner;

public class JalonBlancexo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reste = 100; // 1L = 100 cl

        while (reste > 0) {
            System.out.printf("Vous avez %dcl dans votre bouteille, combien de centilitre vous voulez boire ? : ", reste);
            int quantite = scanner.nextInt();

            if (quantite > reste) {
                quantite = reste; // On ne peut pas boire plus que ce qu'il reste
            }

            reste -= quantite;
            System.out.printf("Vous avez bu %dcl. ", quantite);

            if (reste == 0) {
                System.out.println("Votre bouteille est vide.");
            } else {
                System.out.printf("Il reste encore %dcl dans votre bouteille.%n", reste);
            }
        }
    }
}


