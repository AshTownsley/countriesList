import java.util.Scanner;

public class CountriesListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CountriesList countriesList = new CountriesList();
        
        // Display welcome message
        countriesList.displayWelcomeMessage();

        int menuChoice;

        // Loop to handle menu choices
        do {
            // Display menu and get user choice
            countriesList.displayMenu();
            menuChoice = scanner.nextInt();
            countriesList.setMenuOption(menuChoice);

            // Switch to handle the menu options
            switch (menuChoice) {
                case 1:
                    // Display the countries
                    countriesList.listCountries();
                    break;
                case 2:
                    // Add a country
                    System.out.print("Enter a country name: ");
                    scanner.nextLine(); // Consume the leftover newline character
                    String country = scanner.nextLine();
                    countriesList.addCountry(country);
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        } while (menuChoice != 3); // Exit loop when user chooses 3
        
        scanner.close();
    }
}
