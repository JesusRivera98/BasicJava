public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //Assignation operators
        System.out.println("a equal b? ->" + (a == b));
        System.out.println("a different b? ->" + (a != b));

        //Relational Operators
        System.out.println("a greater than b? ->" + (a > b));
        System.out.println("a less than b? ->" + (a < b));
        System.out.println("a equal or greater than b? ->" + (a >= b));
        System.out.println("a equal or less than b? ->" + (a <= b));

        if (a==b){
            System.out.println("a is equal to b");
        }else if(a != b){
            System.out.println("a is not equal to b");
        }else if(a > b){
            System.out.println("a is greater than b");
        } else if(a < b){
            System.out.println("a is less than b");
        } else if(a >= b){
            System.out.println("a is greater or equal to b");
        } else if(a <= b){
            System.out.println("a is less or equal to b");
        }

    }
}
