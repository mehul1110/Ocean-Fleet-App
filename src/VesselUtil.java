import java.util.ArrayList;
import java.util.List;

/**
 * Utility class to manage vessel performance records.
 */
public class VesselUtil {
    private List<Vessel> vesselList;

    /**
     * Constructor to initialize vesselList
     */
    public VesselUtil() {
        this.vesselList = new ArrayList<>();
    }

    /**
     * Getter for vesselList
     * 
     * @return List of Vessel objects
     */
    public List<Vessel> getVesselList() {
        return vesselList;
    }

    /**
     * Setter for vesselList
     * 
     * @param vesselList List of Vessel objects to set
     */
    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    /**
     * Adds a new vessel object to the vesselList.
     * 
     * @param vessel Vessel object to be added
     */
    public void addVesselPerformance(Vessel vessel) {
        if (vessel != null) {
            vesselList.add(vessel);
        }
    }

    /**
     * Retrieves a vessel by its ID. search is case-sensitive.
     * 
     * @param vesselId ID of the vessel to search for
     * @return Vessel object if found, null otherwise
     */
    public Vessel getVesselById(String vesselId) {
        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }
}
