/**
 * Vessel Model Class
 * Represents a cargo vessel with its performance attributes.
 * 
 * OOPS Principle Applied: Encapsulation
 * The data fields are private and accessed via public getters and setters,
 * ensuring data integrity and hiding the internal state of the object.
 */
public class Vessel {
    private String vesselId;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;

    /**
     * No-argument constructor
     */
    public Vessel() {
    }
     
    /**   
     * Parameterized constructor (four-argument constructor)
     *    
     * @param vesselId Unique ID of the vessel
     * @param vesselName Name of the vessel
     * @param averageSpeed Average speed in knots
     * @param vesselType Type of the vessel (e.g., Cargo, Tanker, Cruise)
     */
    public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    // Getters and Setters

    public String getVesselId() {
        return vesselId;
    }

    public void setVesselId(String vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }
}
