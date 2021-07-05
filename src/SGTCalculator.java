public class SGTCalculator {

    public static void main(String[] args) {

        // Define variables
        int varA, varB, varC;
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

        // Variants 2+ should go below this line
                2*a + 3*b - x^2 |
                a=7, b=2, x = 1.55
                varA = 7;
                varB = 2;
                varX = 1.55;

        result = (2*varA) + 3*varB - Math.pow(varX,2);
        System.out.println("Variant 2. Agnija A.");
        System.out.println(result);

        // 


    }
}
