import java.util.*;
public class Exo1_2{
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        System.out.print("R A: ");
        double R=s.nextDouble(),A=s.nextDouble();
        System.out.println(Math.PI*R*R*A/360);
    }
}