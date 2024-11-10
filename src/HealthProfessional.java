
    public class HealthProfessional {
        // Required instance variables
        private int id; // ID (numbers only)
        private String name; // Name
        private String specialty; // Additional information relevant to health professionals

        // Default constructor
        public HealthProfessional() {

        }

        // Constructor that initializes all instance variables
        public HealthProfessional(int id, String name, String specialty) {
            this.id = id;
            this.name = name;
            this.specialty = specialty;
        }

        // Method to print all instance variables
        public void printInfo() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Specialty: " + specialty);
        }

        // Getters for instance variables (optional, for further use)
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSpecialty(String specialty) {
            this.specialty = specialty;
        }

        public String getName() {
            return name;
        }

        public String getSpecialty() {
            return specialty;
        }
    }









