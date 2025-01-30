import java.util.Scanner;
public class Powercalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the base number:");
        double base=scanner.nextDouble();
        System.out.println("enter the exponent:");
        double exponent=scanner.nextDouble();
        double result=Math.pow(base,exponent);
        System.out.println(base+"raised to the power of"+exponent+"is:"+result);
        scanner.close();
    }
    
}
