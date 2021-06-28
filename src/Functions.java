public class Functions {

    /*
    *
    *
     */

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        double y = 3;
        //Circle area
        //PI * r2
        double area = circleArea(y);
        //System.out.println(area);
        System.out.println(circleArea(y));

        //Sphere area
        //4 * PI * r2
        sphereArea(y);

        //Sphere Volume
        //(4/3) * PI * r3
        System.out.println(sphereVolume(y));

        System.out.println("PESOS TO DOLLARS: " + convertToDollar(200, "MXN"));
        System.out.println("PESOS TO DOLLARS: " + convertToDollar(1000, "COP"));

    }

    /**
     *
     * @param r
     * @return
     */
    public static double circleArea (double r){
        return Math.PI * Math.pow(r, 2);
    }

    /**
     *
     * @param r
     * @return
     */
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    /**
     *
     * @param r
     * @return
     */
    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Description: function that specifying the currency , convert a quantity to dollars
     * @param quantity Amount of money
     * @param currency Currency type: Accept MXN or COP
     * @return quantity return the quantity updated in dollars
     */
    public static double convertToDollar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
