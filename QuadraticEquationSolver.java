import java.util.Scanner;

public class QuadraticEquationSolver{

    public static void Solver(double a, double b, double c){

        double dec = ((b*b)-(4*a*c));

        if (dec ==0) {
            
            double root = ((-b)/(2*a));
            System.out.println("only one solution , x = "+root);
        } else {

            double sqrt = Math.sqrt(dec);
            double root1 = (((-b)+sqrt)/(2*a));
            double root2 = (((-b)-sqrt)/(2*a));
            System.out.println("two solutiions: x = "+root1+"and x = "+root2);
            
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t WELCOME TO QUDRARIC EQUATION SOLVER \n Make sure your equation is like this ax^2+bx+c=0");
        System.out.println("Enter the coeffient of x^2(a)");
        double cxs = sc.nextDouble();
        System.out.println("Enter the coeffient of x (b)");
        double cx = sc.nextDouble();
        System.out.println("Enter the constant term");
        double c = sc.nextDouble();

        Solver(cxs, cx, c);

    }
}