
    import java.util.Scanner;

public class Exo2_1  {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int age; 
        final int AGE_MAJORITE = 18; 
        
        System.out.println("--- Vérification de la Majorité ---");
        
        
        System.out.print("Veuillez saisir votre âge (en années) : ");
        age = scanner.nextInt();
        
        if (age < 0) {
            System.out.println("Message : Vous n'êtes pas encore né.");
        } 
      
        else if (age >= AGE_MAJORITE) {
            System.out.println("Message : Vous êtes majeur.");
        } 
        
        else {
            System.out.println("Message : Vous êtes mineur.");
        }
        
        scanner.close();
    }
}

