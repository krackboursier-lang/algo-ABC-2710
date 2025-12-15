import java.util.Scanner;

public class Exo1_3 { 
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        double R; 
        double A_degres; 
        double aireSecteur;

        final double PI = Math.PI; 
System.out.println("--- Calcul de l'Aire d'un Secteur Circulaire ---");
        
       
        System.out.print("Veuillez saisir le rayon R du cercle : ");
        R = scanner.nextDouble();
        System.out.print("Veuillez saisir l'angle A du secteur (en degrés) : ");
        A_degres = scanner.nextDouble();
        double aireCercle = PI * Math.pow(R, 2); 
        aireSecteur = (aireCercle * A_degres) / 360.0;

       
        System.out.println("\n--- Résultat ---");
        System.out.println("Pour un rayon R = " + R + " et un angle A = " + A_degres + "° :");
        System.out.println("▪ L'aire du secteur circulaire est : " + aireSecteur);
        
        scanner.close();
    
}
}
