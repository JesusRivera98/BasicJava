public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";
        
        switch (colorModeSelected){
            case "Light":
                System.out.println("Selected Light Mode");
                break;
            case "Night":
                System.out.println("Selected Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Selected Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Selected Dark Mode");
                break;
            default:
                System.out.println("Select an option");
        }
    }
}
