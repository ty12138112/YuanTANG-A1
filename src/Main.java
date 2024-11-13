public class Main {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        // Creating three objects of GeneralPractitioner
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Alice", "Family Medicine", "City Health Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. John", "Pediatrics", "Downtown Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Sarah", "Internal Medicine", "Suburban Clinic");

        // Creating two objects of Specialist
        Specialist specialist1 = new Specialist(4, "Dr. Bob", "Cardiology", "Heart Diseases");
        Specialist specialist2 = new Specialist(5, "Dr. Emily", "Dermatology", "Skin Conditions");

        // Printing details of all health professionals
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        specialist1.printDetails();
        System.out.println("------------------------------");
        specialist2.printDetails();
        System.out.println("------------------------------");
    }
}
