import java.util.Scanner;

public class QuadraticEquationSolver{


    // write the solver function
    public static void Solver(double a, double b, double c){

        //store discriment as dis
        double dis = ((b*b)-(4*a*c));


        //check the conditions if the dis equal to zero or not;
        if (dis ==0) {
            
            double root = ((-b)/(2*a));
            System.out.println("only one solution , x = "+root);
        } else {
            
            //store squre root of dis as sqrt
            double sqrt = Math.sqrt(dis);
            double root1 = (((-b)+sqrt)/(2*a));
            double root2 = (((-b)-sqrt)/(2*a));
            System.out.println("two solutiions: x = "+root1+"and x = "+root2);
            
        }

    }
    public static void main(String[] args) {
        //create an object sc for class Scanner
        Scanner sc = new Scanner(System.in);

        //welcome statements
        System.out.println("\t\t WELCOME TO QUDRARIC EQUATION SOLVER \n Make sure your equation is like this ax^2+bx+c=0");

        //Take inputs coeffient of x squre ,x and constant term c.
        System.out.println("Enter the coeffient of x^2(a)");
        double cxs = sc.nextDouble();
        System.out.println("Enter the coeffient of x (b)");
        double cx = sc.nextDouble();
        System.out.println("Enter the constant term");
        double c = sc.nextDouble();

        //call the solver function
        Solver(cxs, cx, c);

        sc.close();

    }
}