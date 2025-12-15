import java.util.*;
public class SwitchCase{
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        System.out.print("Age: ");
        switch(s.nextInt()){
            case 2:System.out.println("bébé");break;
            case 5:System.out.println("enfant");break;
            case 8:System.out.println("pré-ados");break;
            case 13:System.out.println("Adolescent");break;
            case 21:System.out.println("jeune Adulte");break;
            case 25:System.out.println("adulte");break;
            case 40:System.out.println("adulte mure");break;
            case 60:System.out.println("senior");break;
            default:System.out.println("inconnu");
        }
    }
}