
    import java.util.Scanner;

public class Exo1_5 { 
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.println("--- Échange de Valeurs (Swap) ---");
        
        System.out.print("Veuillez saisir le premier nombre entier (a) : ");
        a = scanner.nextInt();
        
        System.out.print("Veuillez saisir le second nombre entier (b) : ");
        b = scanner.nextInt();
        
        System.out.println("\n--- AVANT l'échange ---");
        System.out.println("La valeur de a est : " + a);
        System.out.println("La valeur de b est : " + b);
        
        int temp = a; 
        
        a = b; 
        
        b = temp; 
        
    
        System.out.println("\n--- APRÈS l'échange ---");
        System.out.println("La nouvelle valeur de a est : " + a);
        System.out.println("La nouvelle valeur de b est : " + b);
        
        scanner.close();
    }
}

