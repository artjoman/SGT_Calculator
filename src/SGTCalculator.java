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

      
        // Variants 19 should go below this line
//        7*a + 12.5*b + x +5*y | a=5, b=1, x=7.01, y=3

        varA=5;
        varB=1;
        varX=7.01;
        varY=3;

        result = 7*varA+12.5*varB+varX+5*varY;
        System.out.println("Variant 19 Marta D.");
        System.out.println(result);


     //Variants 6
//        2*a + 3*b - x^2 | a=7, b=2, x = 1.55
        varA= 7;
        varB=2;
        varX=1.55;

        result = 2*varA + 3*varB - Math.pow(varX,2);
        System.out.println("Variant 6. Kristine.");

        // Variants 2+ should go below this line

        // Variant 7. Jelizaveta S.
        // 7*a + 12.5*b + x +5*y
        // a=5, b=1, x=7.01, y=3

        // Variant 5. Tatjana
        // 9*a+sqrt(2*b)-c
        // a = 7, b = 26, c = 16
        varA = 7;
        varB = 26;
        varC = 16;

                2*a + 3*b - x^2 |
                a=7, b=2, x = 1.55
                varA = 7;
                varB = 2;
                varX = 1.55;

        result = (2*varA) + 3*varB - Math.pow(varX,2);
        System.out.println("Variant 2. Agnija A.");
        System.out.println(result);

        // 


        //15.Sabine. 7*a + 12.5*b + x +5*y | a=5, b=1, x=7.01, y=3


        varA = 5;
        varB = 1;
        varX = 7.01;
        varY = 3;

        result = 7*varA + 12.5*varB + varX + 5*varY;
        System.out.println("Variant 7. Jelizaveta S.");

        result = 7*varA + 12.5*varB + varX + 5*varY ;
        System.out.println("Variant 15. Sabine K.");
        System.out.println(result);

        //Variant 14. Liene L.
        //2*a + 3*b - x^2
        //a=7, b=2, x = 1.55
        varA = 7;
        varB = 2;
        varX = 1.55;

        result = 2*varA + 3*varB - Math.pow(varX,2);
        System.out.println("Variant 14. Liene L.");
        System.out.println(result);







      //  18.Anastasija. 2*a + 3*b - x^2
        //  a=7, b=2, x = 1.55
        varA = 7;
        varB = 2;
        varX = 1.55;

        result = 2*varA + 3*varB - Math.pow(varX,2);
        System.out.println("Variant 18. Anastasija.");
        System.out.println(result);


        result = 9*varA + Math.sqrt(2*varB) - varC;
        System.out.println("Variant 5. Tatjana");

        System.out.println(result);
    }
}
