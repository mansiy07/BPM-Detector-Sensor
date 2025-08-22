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

