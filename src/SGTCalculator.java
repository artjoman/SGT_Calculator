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

        // Variant 3. LauraV.
        // 7*a + 12.5*b + x +5*y
        // a=5, b=1, x=7.01, y=3
        varA = 5;
        varB = 1;
        varX = 7.01;
        varY = 3;

        result = 7*(varA) + 12.5*(varB) + varX + 5*(varY);
        System.out.println("Variant 3. LauraV.");
        System.out.println(result);



    }
}
