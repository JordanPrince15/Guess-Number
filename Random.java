import java.util.Scanner; // Import the scanner classs

class Random{ // This is the random class
    public static void main(String[] args) { // Initialize the class
        @SuppressWarnings("resource")
        Scanner userInput = new Scanner(System.in); // This initializes the user input 
        System.out.println("Enter a random number");

        String RandomNum = userInput.nextLine();
        int random = (int) (Math.random() * 10);
        if (Integer.parseInt(RandomNum) == random) {
            System.out.println("You have won");
        }

        else {
            System.out.println("You have not won");
        }
        
    }
}
