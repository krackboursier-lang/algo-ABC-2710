
    import java.util.Scanner;

public class Exo2_3 { 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        double a, b, c;
        
        System.out.println("--- Tri de Trois Nombres Réels ---");
        
        System.out.print("Veuillez saisir le premier nombre (a) : ");
        a = scanner.nextDouble();
        
        System.out.print("Veuillez saisir le deuxième nombre (b) : ");
        b = scanner.nextDouble();
        
        System.out.print("Veuillez saisir le troisième nombre (c) : ");
        c = scanner.nextDouble();
        
        System.out.print("\nOrdre croissant : ");
        
        if (a <= b && a <= c) {
            if (b <= c) {
                
                System.out.println(a + ", " + b + ", " + c);
            } else {
               
                System.out.println(a + ", " + c + ", " + b);
            }
        } 
        
        else if (b <= a && b <= c) {
            if (a <= c) {
                
                System.out.println(b + ", " + a + ", " + c);
            } else {
                
                System.out.println(b + ", " + c + ", " + a);
            }
        } 
        else { 
            if (a <= b) {
               
                System.out.println(c + ", " + a + ", " + b);
            } else {
                
                System.out.println(c + ", " + b + ", " + a);
            }
        }
        
        scanner.close();
    }
}

