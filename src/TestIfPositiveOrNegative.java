import java.util.Scanner;

/*
a Java program to get a number from the user and print whether it is positive or negative.
 */
public class TestIfPositiveOrNegative {

    public static void main(String[] args) {
        int test_data;

        System.out.println("Test Data");
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        test_data = input.nextInt();


        if (test_data > 0) {
            System.out.print(test_data + " is positive.");
        }
        else if (test_data == 0) {
            System.out.print(test_data + " is zero.");
        }
        else {
            System.out.print(test_data + " is negative.");
        }

    }
}
