import java.util.Scanner;

public class Business_CheckISBN_10 {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // Im prompting the user to enter the nine relevant ISBN digits
        System.out.println("Please, enter the nine ISBN digits");
        System.out.print(
                "Enter the first digit: ");
        int number1 = input.nextInt();
        System.out.print(
                "Enter the second digit: ");
        int number2 = input.nextInt();
        System.out.print(
                "Enter the third digit: ");
        int number3 = input.nextInt();
        System.out.print(
                "Enter the fourth digit: ");
        int number4 = input.nextInt();
        System.out.print(
                "Enter the fifth digit: ");
        int number5 = input.nextInt();
        System.out.print(
                "Enter the sixth digit: ");
        int number6 = input.nextInt();
        System.out.print(
                "Enter the seventh digit: ");
        int number7 = input.nextInt();
        System.out.print(
                "Enter the eight digit: ");
        int number8 = input.nextInt();
        System.out.print(
                "Enter the ninth digit: ");
        int number9 = input.nextInt();

        // Calculating the ISBN10 digit
        double ISBNDig10 = (number1*1+number2*2+number3*3+number4*4+number5*5+number6*6+number7*7+number8*8+number9*9)%11;

        if (ISBNDig10 == 10)
        System.out.println(
                number1 +""+ number2 +""+ number3 +""+ number4 +""+ number5 +""+ number6 +""+ number7 +""+ number8 +""+ number9 +""+ "X");
        else
            System.out.println(
                    number1 +""+ number2 +""+ number3 +""+ number4 +""+ number5 +""+ number6 +""+ number7 +""+ number8 +""+ number9 +""+ (int)ISBNDig10);
    }
}
