import java.util.Scanner;
public class Exo1_2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double R; // Rayon
        double aire;
        double volume;
        
        
        final double PI = Math.PI; 

        
        System.out.println("--- Calcul de l'Aire et du Volume d'une Sphère ---");
        System.out.print("Veuillez saisir le rayon (R) de la sphère : ");
        R = scanner.nextDouble();

        aire = 4 * PI * Math.pow(R, 2); 
        volume = (4.0 / 3.0) * PI * Math.pow(R, 3);

        System.out.println("\n--- Résultats pour un rayon R = " + R + " ---");
        System.out.println("▪ Son aire est (4 \u03C0 R\u00B2) : " + aire);
        System.out.println("▪ Son volume est (4/3 \u03C0 R\u00B3) : " + volume);
        
        scanner.close();
    }
}

