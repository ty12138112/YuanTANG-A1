public class AssignmentOne {
    public class Main {
        public static void main(String[] args) {
            // Part 3 – Using classes and objects

            // Creating three objects of GeneralPractitioner
            GeneralPractitioner familyDoctor = new GeneralPractitioner(1, "Dr. Alice", "Family Medicine", "City Health Clinic");
            GeneralPractitioner pediatrician = new GeneralPractitioner(2, "Dr. John", "Pediatrics", "Downtown Clinic");
            GeneralPractitioner internalMedicineDoctor = new GeneralPractitioner(3, "Dr. Sarah", "Internal Medicine", "Suburban Clinic");

            // Creating two objects of Specialist
            Dentist cardiologist = new Dentist(4, "Dr. Bob", "Cardiology", "Heart Diseases");
            Dentist dermatologist = new Dentist(5, "Dr. Emily", "Dermatology", "Skin Conditions");

            // Printing details of all health professionals
            familyDoctor.printDetails();
            System.out.println("------------------------------");
            pediatrician.printDetails();
            System.out.println("------------------------------");
            internalMedicineDoctor.printDetails();
            System.out.println("------------------------------");
            cardiologist.printDetails();
            System.out.println("------------------------------");
            dermatologist.printDetails();
            System.out.println("------------------------------");
        }
    }

}
