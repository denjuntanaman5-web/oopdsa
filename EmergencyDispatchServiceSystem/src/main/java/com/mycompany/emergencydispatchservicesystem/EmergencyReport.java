
package com.mycompany.emergencydispatchservicesystem;

public class EmergencyReport {

    private String incidentId;
    private String callerName;
    private String contactNumber;
    private String location;
    private String emergencyType;
    private String description;
    private String status;

    public EmergencyReport(String incidentId, String callerName,
            String contactNumber, String location,
            String emergencyType, String description) {

        this.incidentId = incidentId;
        this.callerName = callerName;
        this.contactNumber = contactNumber;
        this.location = location;
        this.emergencyType = emergencyType;
        this.description = description;
        this.status = "Pending";
    }

    public String getIncidentId() {
        return incidentId;
    }

    public String getCallerName() {
        return callerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getLocation() {
        return location;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedService() {
        return "General Emergency Services";
    }

    public void displayReport() {
        System.out.println("Incident ID: " + incidentId);
        System.out.println("Caller Name: " + callerName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Location: " + location);
        System.out.println("Emergency Type: " + emergencyType);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Assigned Service: " + getAssignedService());
    }
}



