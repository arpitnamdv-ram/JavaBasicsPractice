import java.util.Scanner;

public class MonthCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("This is a calculator");
        System.out.print("Enter the First No. : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second No. : ");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform from the following options:" +
                "1.Addition" +
                "2.Subtraction" +
                "3.Mutiplication" +
                "4.Division" +
                "5.Modulo");
        System.out.print("Enter Operation : ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1 :
                System.out.println("Answer : "+ a+b);
                break;
            case 2 :
                System.out.println("Answer : " + (a-b));
                break;
            case 3 :
                System.out.println("Answer : "+ a*b);
                break;
            case 4 :
                System.out.println("Answer : "+ a/b);
                break;
            case 5 :
                System.out.println("Answer : "+ a%b);
                break;
            default:
                return;


        }
    }
}
