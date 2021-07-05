public class SGTCalculator {

    public static void main(String[] args) {

        // Define variables
        int varA, varB, varC;
        double varX, varY, varZ;

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
        // 5*a - 3*b + c^7 - x
        // a=6, b=4, c=2, x=1.15


        varA = 6;
        varB = 4;
        varC = 2;
        varX = 1.15;

        result = 5*varA - 3*varB +  Math.pow(varC,7) - varX;
        System.out.println("Variant 12. LauraM");
        System.out.println(result);





    }
}
