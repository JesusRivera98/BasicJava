public class Casting {
    public static void main(String[] args) {
        // Locate 30 dogs in a year
        // How many dog located per month

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // ESTIMATION
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitude
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        double c = a/b;
        System.out.println(c);

        c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
