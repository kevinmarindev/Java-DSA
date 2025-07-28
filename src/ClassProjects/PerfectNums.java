package ClassProjects;

/*
This tool allows users to determine all the perfect numbers
       between 1 and the number passed in by the user.
Perfect numbers are those numbers in which all of its divisors add up to that number
*/

import java.util.Scanner;

public class PerfectNums {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("welcome to the app");
        System.out.println("Please provide a number for which you want all the perfect numbers.");
        System.out.println("This number will serve as the upper bound");
        long userNum;
        if(scanner.hasNextInt()){
            userNum = scanner.nextInt();
            System.out.println(userNum);
            getNumbers(userNum);
            return;
        }
        System.out.println("Please provide a valid number");
    }

    public static String getNumbers(long num){
        StringBuilder perfectNumbers = new StringBuilder();
        for (long i = 1; i <= num; i++) {
            long sum = 0;
            for (long j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                if (perfectNumbers.length() > 0) {
                    perfectNumbers.append(", ");
                }
                perfectNumbers.append(i);
            }
        }
        System.out.println(perfectNumbers);
        return perfectNumbers.toString();
    }
}
