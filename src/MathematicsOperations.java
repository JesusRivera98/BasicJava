public class MathematicsOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI);
        System.out.println(Math.E);
        //Return upper integer
        System.out.println(Math.ceil(x));

        //Return lower integer
        System.out.println(Math.floor(x));

        //Return a number raised to another
        System.out.println(Math.pow(x, y));

        //Return the max value
        System.out.println(Math.max(x, y));

        //Return the square root
        System.out.println((int)Math.sqrt(y));

        //Circle area
        //PI * r2
        System.out.println(Math.PI * Math.pow(y, 2));

        //Sphere area
        //4 * PI * r2
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        //Sphere Volume
        //(4/3) * PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
