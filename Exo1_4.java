import java.util.Scanner;
import java.text.DecimalFormat; 

public class Exo1_4 {     

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        double S; 
        double i; 
        int N;    

        System.out.println("--- Calcul de la Valeur Acquise ---");
        
        System.out.print("Veuillez saisir la somme initiale (S) : ");
        S = scanner.nextDouble();

        System.out.print("Veuillez saisir le taux d'intérêt annuel (i, ex: 0.05 pour 5%) : ");
        i = scanner.nextDouble();

        System.out.print("Veuillez saisir le nombre d'années (N) : ");
        N = scanner.nextInt();
 
        double valeurAcquiseSimple = S * (1 + N * i);
        double valeurAcquiseCompose = S * Math.pow(1 + i, N);

        System.out.println("\n--- Résultats après " + N + " années ---");
        System.out.println("Taux d'intérêt (i) : " + (i * 100) + "%");

        System.out.println("▪ Valeur acquise (Intérêt Simple) : " + df.format(valeurAcquiseSimple));
        System.out.println("▪ Valeur acquise (Intérêt Composé) : " + df.format(valeurAcquiseCompose));
        
        scanner.close();
    }
}



