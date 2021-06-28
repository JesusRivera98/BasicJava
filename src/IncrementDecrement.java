public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4
        lives--;
        System.out.println(lives); //3

        lives++;
        System.out.println(lives); //4

        //Prefix
        // Earn a Gift warning a live
        int gift = 100 + lives++; //prefix
        System.out.println(gift); //104
        System.out.println(lives); //5

        //Postfix
        // Earn a Gift earning a live
        gift = 100 + ++lives; //postfix
        System.out.println(gift); //106
        System.out.println(lives); //6
    }
}
