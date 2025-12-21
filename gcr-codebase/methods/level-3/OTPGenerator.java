// Writing a Java Program to generate 6-digit OTPs and check their uniqueness
public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check whether all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {

        // Compare each OTP with every other OTP
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true; // all OTPs are unique
    }

    // Main method
    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTPs 10 times and store in array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check uniqueness
        boolean unique = areOTPsUnique(otps);

        System.out.println("\nAre all OTPs unique? " + unique);
    }
}
