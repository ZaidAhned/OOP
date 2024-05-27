public class SoftwareEngineer {
    String name;
    String expertise;
    String favoriteProject;

    // Constructor
    public SoftwareEngineer(String name, String expertise, String favoriteProject) {
        this.name = name;
        this.expertise = expertise;
        this.favoriteProject = favoriteProject;
    }

    // Method to introduce the software engineer
    public void introduce() {
        System.out.println("Hi, I'm " + name + ". I'm good at " + expertise + ".");
        System.out.println("My favorite project is " + favoriteProject + ".");
    }

    // Method for coding
    public void code() {
        System.out.println(name + " is coding " + favoriteProject + " using " + expertise + ".");
    }

    public static void main(String[] args) {
        // Creating a software engineer object
        SoftwareEngineer engineer1 = new SoftwareEngineer("Alice", "Java", "Online Shopping App");

        // Introducing the software engineer
        engineer1.introduce();

        // Simulating coding action
        engineer1.code();
    }
}
