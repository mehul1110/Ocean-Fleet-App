import java.util.List;
import java.util.Scanner;

/**
 * UserInterface class for console-based interaction.
 * 
 * OOPS Principle Applied: Single Responsibility Principle
 * This class is solely responsible for handling user input and displaying
 * output,
 * delegating the business logic to the VesselUtil class.
 */
public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();

        // Step 1: Add Vessel Details
        System.out.println("Enter the number of vessels to be added");
        int numberOfVessels = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter vessel details");
        for (int i = 0; i < numberOfVessels; i++) {
            String details = scanner.nextLine();
            String[] parts = details.split(":");

            if (parts.length == 4) {
                String vesselId = parts[0];
                String vesselName = parts[1];
                double averageSpeed = Double.parseDouble(parts[2]);
                String vesselType = parts[3];

                Vessel vessel = new Vessel(vesselId, vesselName, averageSpeed, vesselType);
                vesselUtil.addVesselPerformance(vessel);
            }
        }

        // Step 2: Retrieve Vessel by ID
        System.out.println("Enter the Vessel Id to check speed");
        String searchId = scanner.nextLine();

        Vessel foundVessel = vesselUtil.getVesselById(searchId);
        if (foundVessel != null) {
            System.out.println(foundVessel.getVesselId() + " | " +
                    foundVessel.getVesselName() + " | " +
                    foundVessel.getVesselType() + " | " +
                    foundVessel.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        // Step 3: High Performance Vessels
        List<Vessel> highPerformanceVessels = vesselUtil.getHighPerformanceVessels();
        System.out.println("High performance vessels are");
        for (Vessel vessel : highPerformanceVessels) {
            System.out.println(vessel.getVesselId() + " | " +
                    vessel.getVesselName() + " | " +
                    vessel.getVesselType() + " | " +
                    vessel.getAverageSpeed() + " knots");
        }

        scanner.close();
    }
}
