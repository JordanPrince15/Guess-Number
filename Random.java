import java.util.Scanner; // Import the scanner classs

class Random{ // This is the random class
    public static void main(String[] args) { // Initialize th3e class
        @SuppressWarnings("resource")
        Scanner myObject = new Scanner(System.in);
        System.out.println("Enter a random number");

        String RandomNum = myObject.nextLine();
        int random = (int) (Math.random() * 10);
        if (Integer.parseInt(RandomNum) == random) {
            System.out.println("You have won");
        }

        else {
            System.out.println("You have not won");
        }
        
    }
}