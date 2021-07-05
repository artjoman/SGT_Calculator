public class SGTCalculator {

    public static void main(String[] args) {

        // Define variables
        int varA, varB;
        int varC;
        double varX, VarY, varZ;
        double result;

        // Variant 1. Artjoms P.
        // a^3 + 5*b + sqrt(x)
        // a = 7, b = 95, x = 179.62
        varA = 7;
        varB = 95;
        varX = 179.62;

        result = Math.pow(varA,3) + 5*varB + Math.sqrt(varX);
        System.out.println("Variant 1. Artjoms P.");
        System.out.println(result);

         // 9*a + sqrt(2*b) -c
        // a=7, b=26, c=16
        varA = 7;
        varB = 26;
        varC = 16;

        result = 9*varA + Math.sqrt(2*varB) - varC;
        System.out.println("Variant 21. Lasma");
        System.out.println(result);


    }
}
