/*   16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

public class DigitalWatchSimulator {

    public static void main(String[] args) {

        System.out.println("\n===========================================");
        System.out.println("           DIGITAL WATCH SIMULATION         ");
        System.out.println("===========================================\n");

        System.out.println("Watch Started...\n");

        // Hours loop
        for (int hour = 0; hour < 24; hour++) {

            // Minutes loop
            for (int minute = 0; minute < 60; minute++) {

                System.out.printf("🕒 Time  |  %02d : %02d\n", hour, minute);

                // Simulate power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("\n-------------------------------------------");
                    System.out.println("⚠ POWER CUT DETECTED!");
                    System.out.println("Watch Stopped Working at 13:00");
                    System.out.println("-------------------------------------------");
                    return;
                }
            }

            // Hour separator
            System.out.println("-------------------------------------------");
        }
    }
}
