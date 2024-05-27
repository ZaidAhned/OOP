public class PowerRanger {
    // Fields
    private String color;
    private String helmet;
    private String weapon;

    // Constructor to initialize fields
    public PowerRanger(String color, String helmet, String weapon) {
        this.color = color;
        this.helmet = helmet;
        this.weapon = weapon;
    }

    // Method to display a unique action
    public String performAction() {
        return "The " + color + " Ranger uses the " + weapon + " with their " + helmet + "!";
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects of PowerRanger
        PowerRanger redRanger = new PowerRanger("Red", "Dragon Helmet", "Sword");
        PowerRanger blueRanger = new PowerRanger("Blue", "Shark Helmet", "Trident");

        // Displaying the actions of the Power Rangers
        System.out.println(redRanger.performAction());  // Output: The Red Ranger uses the Sword with their Dragon Helmet!
        System.out.println(blueRanger.performAction());  // Output: The Blue Ranger uses the Trident with their Shark Helmet!
    }
}