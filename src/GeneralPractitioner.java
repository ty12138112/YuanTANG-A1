public class GeneralPractitioner extends HealthProfessional {
    private String clinicName; // Additional variable specific to General Practitioner

    // Default constructor
    public GeneralPractitioner() {
        super(); // Call the default constructor of the base class
        this.clinicName = "Default Clinic"; // Default clinic name
    }

    // Constructor that initializes all instance variables
    public GeneralPractitioner(int id, String name, String specialty, String clinicName) {
        super(id, name, specialty); // Call the parameterized constructor of the base class
        this.clinicName = clinicName;
    }

    // Method to print health professional details
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printInfo(); // Call the printInfo method from the base class
        System.out.println("Clinic Name: " + clinicName);
        System.out.println("Type: General Practitioner");
    }
}

