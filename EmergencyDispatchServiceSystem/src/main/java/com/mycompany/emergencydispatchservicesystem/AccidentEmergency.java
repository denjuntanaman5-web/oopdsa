
package com.mycompany.emergencydispatchservicesystem;

public class AccidentEmergency extends EmergencyReport {

    public AccidentEmergency(String incidentId, String callerName,
            String contactNumber, String location,
            String description) {

        super(incidentId, callerName, contactNumber,
                location, "Accident", description);
    }

    @Override
    public void displayReport() {
        System.out.println("=== ACCIDENT EMERGENCY ===");
        super.displayReport();
    }
}

