public class Appointment {
    // Instance variables
    private Patient patient; // Using Patient class
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor; // Can be GeneralPractitioner or Specialist

    // Default constructor
    public Appointment() {
        this.patient = new Patient();
        this.preferredTimeSlot = "";
        this.selectedDoctor = null;
    }

    // Constructor that initializes all instance variables
    public Appointment(Patient patient, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patient = patient;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Method to print all instance variables
    public void printAppointmentDetails() {
        patient.printDetails(); // Print patient details
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.print("Selected Doctor: ");
        if (selectedDoctor != null) {
            selectedDoctor.printInfo(); // Assuming printDetails is defined in HealthProfessional
        } else {
            System.out.println("No doctor selected.");
        }
    }
}
