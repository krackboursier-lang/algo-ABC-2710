package exercices;

public class exo2_cor {
    public static void main(String[] args) {

int a;
        int b;
        int soustraction;

        Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

        System.out.println("La valeur de a"); // Affiche un message
        a = clavier.nextInt(); // On affecte une valeur Scanner de type entier à A
        System.out.println("La valeur de b");// Affiche un message
        b = clavier.nextInt();// On affecte une valeur Scanner de type entier à B

        soustraction = a - b; //calcul la différence

        System.out.println("a-b= " + soustraction); /* Afficher votre instruction , concaténation pour la phrase dynamique */

        if (soustraction < 10) { /* Condition où l'instruction est si la soustraction est inférieur à 10 */

            System.out.println("Le résultat est inférieur à 10"); /* VRAI */

        } else if (soustraction == 10) { /* Si la première condition est fausse alors on lance cette condition */

            System.out.println("Le résultat est égale à 10"); /* VRAI */

        } else {

            System.out.println("Le résultat est supérieur à 10"); /* FAUX */

        }

        clavier.close();




        
    }
    
}
