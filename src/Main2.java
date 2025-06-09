import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){
        // Below if code for running the factorial method
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int input = scanner.nextInt();
//        System.out.println(calcFactorial(input));
        // END FACTORIAL CODE


    }

    public static long calcFactorial(int input){
        if(input == 1) return 1;
        return input * calcFactorial(input - 1);
    }
}
