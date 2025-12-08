package exercices;

import java .util.Scanner; 

public class exo7_cor { 
    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

       String response; //  Déclaration d'une variable a de Type String */


        System.out.println("Do you speak english ?"); /* Afficher le message pour votre question */
          
          Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          response = clavier.nextLine(); // Affection de la valeur Scanner tapé sur le clavier à la variable response

        if(response.equalsIgnoreCase(("y"))){

            System.out.println("Nice to meet you");

        }

        else if(response.equalsIgnoreCase(("n"))){

            System.out.println("So learn english !");

        }

        else{
            
        System.out.println("Erreur : Veuillez répondre par Y (oui) ou N (non)");

        }

        clavier.close();
    }
}   