import java.util.Scanner;

/**
* This program will calculate the volume of a sphere.
*
* @author  Remy Skelton
* @version 1.0
* @since   2025-February-10
*/

final class VolSphere {


    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
    */
    private VolSphere() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        // Ask user to enter the radius
        System.out.println("Please enter the radius of the sphere in cm: ");

        // Use a scanner to get the radius from user
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        // convert the string to a double
        final double radDouble = Double.parseDouble(radString);

        // If else statement for invalid input
        if (radDouble < 0) {
            System.out.println("The radius must be positive.");
        } else {
            // Calculate the volume of the sphere
            final double volume = (4d / 3d) * Math.PI * Math.pow(radDouble, 3);

            // Display the volume
            System.out.print("The volume of a sphere with a radius of ");
            System.out.print(radString + "cm, is ");
            System.out.format(" %.2f", +volume);
            System.out.println("cm^3");
        }

        // Close the scanner
        scanner.close();
    }
}
