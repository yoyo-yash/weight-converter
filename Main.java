import java.util.Scanner; // importing scanner
class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // set up new scanner object

        //heading and design
        System.out.println("WEIGHT CONVERTER");
        System.out.println("----------------");

        // defining variables
        double weight;
        double weightnew;
        int choice;

        // prompt user for a choice
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");
        System.out.print("Choose a choice: ");

        // input user choice
        choice = scanner.nextInt();

        // calculation
        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            weightnew = weight * 0.453592;
            System.out.printf("Weight in kgs is %.1f", weightnew); // return final answer (if applicable)
        }
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            weightnew = weight * 2.20462;
            System.out.printf("Weight in lbs is %.1f", weightnew); // return final answer (if applicable)
        }
        else{
            System.out.println("INVALID CHOICE!"); // tells user their choice is invalid
        }

        scanner.close(); // close scanner

    }
}
