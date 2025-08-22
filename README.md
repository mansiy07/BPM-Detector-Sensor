# BPM-Detector-Sensor
|| BPM Detector Sensor Using Core Java🖲️||


Key Features:
1. Input simulated pulse signals.
2. Calculate BPM (Beats Per Minute).
3. Display heart rate and alerts if heart rate is abnormal.
4. Can be extended for GUI or hardware integration.


Source Code:

import java.util.Scanner;

public class BPMDetector {

    // Method to calculate BPM
    public static int calculateBPM(int beats, int durationSeconds) {
        // BPM = (beats / duration in seconds) * 60
        return (int) ((beats / (double) durationSeconds) * 60);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BPM (Heart Rate) Detector ===");
        
        System.out.print("Enter duration of measurement in seconds: ");
        int duration = scanner.nextInt();

        System.out.print("Enter number of beats detected: ");
        int beats = scanner.nextInt();

        int bpm = calculateBPM(beats, duration);

        System.out.println("\nDetected Heart Rate (BPM): " + bpm);

        // Provide basic health alert
        if (bpm < 60) {
            System.out.println("Alert: Heart rate is below normal (Bradycardia)");
        } else if (bpm > 100) {
            System.out.println("Alert: Heart rate is above normal (Tachycardia)");
        } else {
            System.out.println("Heart rate is normal.");
        }

        scanner.close();
    }
}


Run this Code:
1. Open Command Prompt / Terminal.
2. Compile the code: javac BPMDetector.java
                     java BPMDetector
3. Enter duration of measurement (in seconds) and number of beats detected.
4. It will calculate and display BPM with alerts.


Advantages of this Project:
1. Helps in real-time heart rate monitoring.
2. Can be integrated with actual pulse sensors.
3. Useful for fitness apps, healthcare monitoring systems, and research projects.
