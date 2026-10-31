
package com.mycompany.emergencydispatchservicesystem;

public class MedicalEmergency extends EmergencyReport {

    public MedicalEmergency(String incidentId, String callerName,
            String contactNumber, String location,
            String description) {

        super(incidentId, callerName, contactNumber,
                location, "Medical", description);
    }

    @Override
    public void displayReport() {
        System.out.println("=== MEDICAL EMERGENCY ===");
        super.displayReport();
    }
}

