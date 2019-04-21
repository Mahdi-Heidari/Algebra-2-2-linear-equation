package linearequation;

import java.util.Scanner;

public class LinearEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, e, c, d, f;

        System.out.println("This program will solve 2*2 lenear equation depending on your input values"
                + " and based on the Camer's rule.");

        System.out.println("\nax + by = e\ncx + dy = f");

        System.out.println("\nBased on the preceded formula, assign your values accordingly: \na, b, e, c, d, f\n");

        a = input.nextDouble();
        b = input.nextDouble();
        e = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        f = input.nextDouble();

        System.out.printf("\nX: %f\t Y:%f\n\n", (((e * d) - (b * f))) / ((a * d) - (b * c)), (((a * f) - (e * c))) / ((a * d) - (b * c)));

    }

}
