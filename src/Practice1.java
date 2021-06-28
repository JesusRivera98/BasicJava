public class Practice1 {
    public static void main(String[] args) {
        /**
         * Exercise 1: Family
         */
        String father = "Rafael Rivera Zuviri";
        String mother = "Delia Flores Sanchez";
        String brother = "Rafael Rivera Flores";
        String sister = "Delia Cristal Rivera Flores";
        String littleSister = "Abril Cristina Rivera Flores";

        int fatherAge = 2020-1962;
        int motherAge = 2021-1974;
        int brotherAge = 2021-1995;
        int sisterAge = 2020-1997;
        int littleSisterAge = 2020-2001;

        System.out.println("My family: ");
        System.out.println("My father is "+father+" and is "+fatherAge+" years old");

        /**
         * Exercise 2: Casting
         *
         */
        char c = 'z'; //conviertelo a int
        int nI = c;
        System.out.println(nI);
        int i = 250; //conviertelo a long y luego de long a short
        long nL = i;
        System.out.println(nL);
        short nS = (short) nL;
        System.out.println(nS);
        double d = 301.067; //conviertelo a long
        nL = (long) d;
        System.out.println(nL);
        i = 100; //súmale 5000.66 y conviertelo a float
        float nF = (float) (i + 5000.66);
        System.out.println(nF);
        i = 737; //multiplícalo por 100 y conviertelo a byte
        byte nB = (byte)(i*100);
        System.out.println(nB);
        d = 298.638; //divídelo entre 25 y conviertelo a long
        nL = (long) (d/25);
        System.out.println(nL);

    }



}
