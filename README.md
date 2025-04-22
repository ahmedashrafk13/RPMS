# 📡 Remote Patient Monitoring System (RPMS)

The **Remote Patient Monitoring System (RPMS)** is a comprehensive healthcare application designed to improve doctor-patient communication and enable the real-time monitoring of patients' health. It integrates with **Email**, **SMS (Twilio)**, and **WhatsApp** to provide notifications for important events, such as appointment reminders, medication alerts, emergency alerts based on vital signs, and panic button triggers. Additionally, it allows for video calls with integrated support for **Google Meet** and **Zoom**. This system aims to enhance the quality of patient care by providing timely updates and enabling quick responses to critical situations.

---

## 🚀 Features

- 📧 **Email Notifications**: Send emergency notifications, reminders, and alerts via email.
- 📱 **SMS Notifications**: Send SMS messages using **Twilio** API for quick communication with patients and healthcare providers.
- 🟢 **WhatsApp Integration**: Generate WhatsApp chat links that users can click to start a chat with healthcare professionals.
- 📅 **Appointment Reminders**: Notify patients about upcoming appointments via email.
- 💊 **Medication Reminders**: Send medication reminders to patients to ensure timely adherence.
- 🚨 **Emergency Vitals Alerts**: Trigger emergency alerts when critical health parameters (like heart rate and blood pressure) exceed predefined thresholds.
- 🔘 **Panic Button**: A panic button feature that notifies doctors or emergency contacts in case of an emergency.
- 🎥 **Video Call Integration**: Open a meeting link in a browser to start video calls via **Google Meet** or **Zoom**.
- 💬 **Real-time Chat**: Integrated real-time messaging via WhatsApp links for direct communication between doctors and patients.

---

## 🧰 Technologies Used

The system utilizes the following technologies to implement various features:

- **Java 17+**: The primary programming language used to build the system.
- **Maven**: Dependency management and build tool for the project.
- **Twilio API**: For SMS notifications.
- **Jakarta Mail**: For sending email notifications through Gmail's SMTP server.
- **AWT (Abstract Window Toolkit)**: For opening URLs (like WhatsApp links) in a browser.
- **Google Meet / Zoom**: For starting video calls using meeting links.
- **Object-Oriented Design**: A modular and extensible design based on Java classes and interfaces.

---

## 🏗️ Project Structure

The project is organized in a modular structure with distinct classes handling various functionalities. Here's a breakdown of the project's structure:



