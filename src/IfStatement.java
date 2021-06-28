public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSent = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSent++;
            System.out.println("File Sent");

            //int i = 0;
            //i++;
        } else {
            fileSent--;
            System.out.println("Please turn on your bluetooth, to start the transfer");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSent);
        //System.out.println(i);


    }
}
