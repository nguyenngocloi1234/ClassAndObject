import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        double r1,r2,delta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a= scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b,c);
        delta = quadraticEquation.getDiscriminant();
        r1 = quadraticEquation.getRoot1();
        r2 = quadraticEquation.getRoot2();
        System.out.println("delta = " + delta+", r1 = "+r1+", r2 = "+r2);

    }


}
