public class Dentist extends HealthProfessional {



        private String Annual_salary; // Additional variable specific to Specialist

        // Default constructor
    public Dentist() {
            super(); // Call the default constructor of the base class
            this.Annual_salary = "General"; // Default area of expertise
        }

        // Constructor that initializes all instance variables
    public Dentist(int id, String name, String specialty, String Annual_salary) {
            super(id, name, specialty); // Call the parameterized constructor of the base class
            this.Annual_salary = Annual_salary;
        }

    public void setAnnual_salary(String annual_salary) {
        Annual_salary = annual_salary;
    }

    public String getAnnual_salary() {
        return Annual_salary;
    }

    // Method to print health professional details
        public void printDetails() {
            System.out.println("The health professional details are:");
            super.printInfo(); // Call the printInfo method from the base class
            System.out.println("Area of Expertise: " + Annual_salary);
            System.out.println("Type: Dentist");
        }
    }

