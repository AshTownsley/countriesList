import java.util.ArrayList;
import java.util.Collections;

public class CountriesList {
    // Data
    private ArrayList<String> countries = new ArrayList<>();
    private int menuOption;

    // Method to display the welcome message
    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Country List Application!");
    }

    // Method to display the menu options
    public void displayMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Display countries");
        System.out.println("2. Add a country");
        System.out.println("3. Exit");
    }

    // Method to get the user's menu option
    public int getMenuOption() {
        return menuOption;
    }

    // Method to check if a country already exists in the list
    public boolean checkForCountry(String country) {
        for (String existingCountry : countries) {
            if (existingCountry.equalsIgnoreCase(country)) {
                return true; // Country exists
            }
        }
        return false; // Country does not exist
    }

    // Method to add a country to the list
    public void addCountry(String country) {
        if (!checkForCountry(country)) {
            countries.add(country);
            System.out.println(country + " has been added.");
        } else {
            System.out.println("Country already exists in the list.");
        }
    }

    // Method to list all countries, sorted
    public void listCountries() {
        if (countries.isEmpty()) {
            System.out.println("No countries to display.");
        } else {
            Collections.sort(countries);
            System.out.println("Countries in the list (sorted):");
            for (String country : countries) {
                System.out.println(country);
            }
        }
    }

    // Method to set the menu option based on user input (used in the test class)
    public void setMenuOption(int option) {
        this.menuOption = option;
    }
}
