
package com.mycompany.emergencydispatchservicesystem;

public class FireEmergency extends EmergencyReport {

    public FireEmergency(String incidentId, String callerName,
            String contactNumber, String location,
            String description) {

        super(incidentId, callerName, contactNumber,
                location, "Fire", description);
    }

    @Override
    public String getAssignedService() {
        return "Fire Department";
    }

    @Override
    public void displayReport() {
        System.out.println("=== FIRE EMERGENCY ===");
        super.displayReport();
    }
}


