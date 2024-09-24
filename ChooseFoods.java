import java.util.*;
//import java.swing; 

public class ChooseFoods {
    static Scanner scan = new Scanner(System.in);
    static int numChoices; 
    static String[] foodChoices;
    //static JFrame frame;

    public static void main (String[] args) {
        makeArray();
        printArray(foodChoices);
        chooseFood();
        //createWindow();
    }
    
    public static void makeArray() {
        System.out.println("How many choices do you have in mind? ");
        numChoices = scan.nextInt();
        foodChoices = new String[numChoices];
        System.out.println("What are you craving?"); 
        
        for (int i = 0; i < numChoices; i++) { // makes the array with your cravings
            foodChoices[i] = scan.next(); 
        }
    }

    public static void printArray(String[] foodChoices) {
        System.out.println("Here are your choices: ");
        for (int i = 0; i < numChoices; i++){
            System.out.print(foodChoices[i]);
            if (i < numChoices - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void chooseFood() {
        System.out.println("You should eat......"); 
        int index = (int) (Math.random() * numChoices);
        String choice = foodChoices[index];

    System.out.println(choice);
}

// needa make gui 
// public static void createWindow() {
//     frame = new Jframe();
// }
}
