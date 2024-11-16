public class Patient {
    private String name;
    private String mobile;

    // Default constructor
    public Patient() {
        this.name = "";
        this.mobile = "";
    }

    // Constructor that initializes all instance variables
    public Patient(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    // Method to print patient details
    public void printDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Mobile: " + mobile);
    }
}
