/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */
import java.util.*;

interface Notifiable {
    void sendNotification(String message, String recipient);
}


public class R_P_M_S {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmailNotification emailNotification = new EmailNotification();
        NotificationService notificationService = new NotificationService();
        ReminderService reminderService = new ReminderService(emailNotification);
        EmergencyAlert emergencyAlert = new EmergencyAlert(emailNotification);
        PanicButton panicButton = new PanicButton(emailNotification);
        ChatServer chatServer = new ChatServer("19706603801");
        ChatClient chatClient = new ChatClient(chatServer);

        while (true) {
            System.out.println("\n======= Remote Patient Monitoring System =======");
            System.out.println("1. Send General Email Notification");
            System.out.println("2. Send Appointment Reminder");
            System.out.println("3. Send Medication Reminder");
            System.out.println("4. Check Vitals & Trigger Emergency Alert");
            System.out.println("5. Trigger Panic Button Alert");
            System.out.println("6. Start WhatsApp Chat");
            System.out.println("7. Start Video Call");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter recipient email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter message: ");
                    String message = scanner.nextLine();
                    emailNotification.sendNotification(message, email);
                    break;

                case 2:
                    System.out.print("Patient name: ");
                    String patientName1 = scanner.nextLine();
                    System.out.print("Appointment date/time: ");
                    String appointment = scanner.nextLine();
                    System.out.print("Recipient email: ");
                    String email1 = scanner.nextLine();
                    reminderService.sendAppointmentReminder(patientName1, appointment, email1);
                    break;

                case 3:
                    System.out.print("Patient name: ");
                    String patientName2 = scanner.nextLine();
                    System.out.print("Medication details: ");
                    String medDetails = scanner.nextLine();
                    System.out.print("Recipient email: ");
                    String email2 = scanner.nextLine();
                    reminderService.sendMedicationReminder(patientName2, medDetails, email2);
                    break;

                case 4:
                    System.out.print("Patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Heart Rate: ");
                    int hr = Integer.parseInt(scanner.nextLine());
                    System.out.print("Systolic BP: ");
                    int sbp = Integer.parseInt(scanner.nextLine());
                    System.out.print("Diastolic BP: ");
                    int dbp = Integer.parseInt(scanner.nextLine());
                    System.out.print("Recipient email: ");
                    String email4 = scanner.nextLine();
                    Vitals vitals = new Vitals(hr, sbp, dbp);
                    emergencyAlert.checkVitalsAndAlert(name, vitals.getHeartRate(), vitals.getSystolicBP(), vitals.getDiastolicBP(), email4);
                    break;

                case 5:
                    System.out.print("Patient name: ");
                    String pname = scanner.nextLine();
                    System.out.print("Patient ID: ");
                    String pid = scanner.nextLine();
                    System.out.print("Recipient email: ");
                    String email5 = scanner.nextLine();
                    panicButton.triggerPanicAlert(pname, pid, email5);
                    break;

                case 6:
                    System.out.print("Message to send via WhatsApp: ");
                    String chatMsg = scanner.nextLine();
                    chatClient.startChat(chatMsg);
                    break;

                case 7:
                    System.out.print("Enter Google Meet or Zoom link: ");
                    String link = scanner.nextLine();
                    try {
                        VideoCall videoCall = new VideoCall(link);
                        videoCall.startCall();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("👋 Exiting RMPS. Stay safe!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }
}

