import java.util.Scanner;

public class Temperature_Converter {

    public static void main(String[] args) {
        System.out.println("Welcome, this program takes in a temperature as input and an input indicating \n" +
                " whether were converting Celsius to Fahrenheit or Fahrenheit to Celsius");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter \"F\" if were converting from fahrenheit. \n" +
                "Please enter \"C\" if were converting celsius.");

        String temp_key = scan.nextLine();

        System.out.println("please enter numerical value of the temperature ");

        double temp_value = scan.nextDouble();

        if (temp_key.equals("F"))
        {
            double result = temp_value - 32 / 1.8;

            System.out.println("When converting " + temp_value + " from fahrenheit to Celsius,\n" +
                    "the result is " + result);
        }
        else if (temp_key.equals("C"))
        {
            double result = temp_value * 1.8 + 32;

            System.out.println("When converting " + temp_value + " from fahrenheit to Celsius,\n" +
                    "the result is " + result);
        }
        else
        {
            System.out.println("not a valid key, next time make sure you enter \"F\" or \"C\" \n");
        }
    }
}
