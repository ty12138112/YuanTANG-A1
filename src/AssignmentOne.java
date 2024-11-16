import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentOne {


    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        HealthProfessional gp1 = new GeneralPractitioner(1, "Zidong PENG", "Family Medicine", "City Health Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Yu HUANG", "Pediatrics", "Downtown Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Xing LIU", "orthopedics", "People's Hospital");


        HealthProfessional specialist1 = new Dentist(3, "Hengyi ZHANG", "Cardiology", "Heart Diseases");
        Dentist specialist2 = new Dentist(4, "Yule TIAN", "Dermatology", "Skin Conditions");



        // Printing details of all health professionals
        gp1.printDetails();
        System.out.println("-------------1-----------------");

        gp2.printDetails();
        System.out.println("--------------2----------------");

        gp3.printDetails();
        System.out.println("--------------3----------------");

        specialist1.printDetails();
        System.out.println("-------------1-----------------");

        specialist2.printDetails();
        System.out.println("-------------2-----------------");




        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Create appointments
        createAppointment(appointments, new Patient("Jinxing LIU", "15699784458"), "10:00", gp1);
        createAppointment(appointments, new Patient("Long CHENG", "15688669863"), "14:00", gp2);
        createAppointment(appointments, new Patient("Yuyan PENG", "18888888888"), "09:00", specialist1);
        createAppointment(appointments, new Patient("Qingshan LIU", "19988665542"), "11:30", specialist2);

        // Print existing appointments
        printExistingAppointments(appointments);
        System.out.println("------------------------------");

        // Cancel one of the existing appointments
        cancelBooking(appointments, "18888888888"); // Cancel John Doe's appointment
        System.out.println("------------------------------");

        // Print again existing appointments to demonstrate the updated collection
        printExistingAppointments(appointments);
        System.out.println("------------------------------");


    }










        // Method to create a new appointment
        public static void createAppointment(ArrayList<Appointment> appointments, Patient patient, String timeSlot, HealthProfessional doctor) {
            if (patient.getName().isEmpty() || patient.getMobile().isEmpty() || timeSlot.isEmpty() || doctor == null) {
                System.out.println("Unable to create appointment. All information must be provided.");
                return;
            }
            Appointment newAppointment = new Appointment(patient, timeSlot, doctor);
            appointments.add(newAppointment);
            System.out.println("Appointment created for " + patient.getName() + " with " + doctor.getName() + " at " + timeSlot);
        }

        // Method to print existing appointments
        public static void printExistingAppointments(ArrayList<Appointment> appointments) {
            if (appointments.isEmpty()) {
                System.out.println("No existing appointments.");
                return;
            }
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println("------------------------------");
            }
        }

        // Method to cancel a booking using a patient's mobile phone
        public static void cancelBooking(ArrayList<Appointment> appointments, String mobile) {
            Iterator<Appointment> iterator = appointments.iterator();
             int I1 =  appointments.size();

            while (iterator.hasNext()) {
                Appointment appointment = iterator.next();
                boolean B1 = appointment.getPatient().getMobile().equals(mobile);
                if (B1) {
                    iterator.remove();
                    System.out.println("Appointment for " + appointment.getPatient().getName() + " has been canceled.");

                    break;
                }

            }

            if (appointments.size()==I1) {
                System.out.println("No appointment found for mobile number: " + mobile);
            }
    }

        }
