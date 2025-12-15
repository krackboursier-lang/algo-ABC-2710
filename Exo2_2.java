
    import java.util.Scanner;

public class Exo2_2 { 
    public static void main(String[] args) {
        // 1. Initialisation et Saisie
        Scanner scanner = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.println("--- Affichage dans l'Ordre Croissant ---");
        
        // Saisie du premier nombre entier
        System.out.print("Veuillez saisir le premier nombre entier (a) : ");
        a = scanner.nextInt();
        
        // Saisie du second nombre entier
        System.out.print("Veuillez saisir le second nombre entier (b) : ");
        b = scanner.nextInt();
        
        // 2. Vérification et Affichage Conditionnel
        System.out.println("\n--- Résultat ---");
        
        // Si 'a' est inférieur ou égal à 'b', l'ordre croissant est a, b.
        if (a <= b) {
            System.out.println("Ordre croissant : " + a + ", " + b);
        } 
        // Sinon (si 'a' est strictement supérieur à 'b'), l'ordre croissant est b, a.
        else {
            System.out.println("Ordre croissant : " + b + ", " + a);
        }
        
        scanner.close();
    }
}
