
package com.mycompany.emergencydispatchservicesystem;

public class EmergencyDispatchServiceSystem {

    public static void main(String[] args) {

        // Create a Singly Linked List
        EmergencyDataStructure<String> reports =
                new EmergencyDataStructure<>();

        // Add sample emergency reports
        reports.add("INC-001 - Fire Emergency");
        reports.add("INC-002 - Medical Emergency");
        reports.add("INC-003 - Accident Emergency");

        // Display all reports
        System.out.println("=== EMERGENCY REPORTS ===");

        reports.display();

        // Display total number of reports
        System.out.println("Total Reports: " + reports.getSize());
        System.out.println("\n=== SEARCH RESULT ===");

        String result = reports.search("INC-002");

        if (result != null) {
        System.out.println("Report Found: " + result);
        } else {
        System.out.println("Report not found.");
        }
        
        System.out.println("\n=== DELETE REPORT ===");

        boolean deleted = reports.delete("INC-002");

        if (deleted) {
            System.out.println("Report successfully deleted!");
        } else {
            System.out.println("Report not found.");
        }

        System.out.println("\n=== UPDATED REPORTS ===");
        reports.display();

        System.out.println("Total Reports: " + reports.getSize());
        
        System.out.println("\n=== INSERT AT BEGINNING ===");

        reports.addFirst("INC-004 - Rescue Emergency");

        reports.display();

        System.out.println("Total Reports: " + reports.getSize());
        
        System.out.println("\n=== UPDATE REPORT ===");

        boolean updated = reports.update(
                "INC-001",
                "INC-001 - Updated Fire Emergency"
        );

        if (updated) {
            System.out.println("Report successfully updated!");
        } else {
            System.out.println("Report not found.");
        }

        reports.display();
        
        System.out.println("\n=== INSERT AT POSITION ===");

        boolean inserted = reports.addAtPosition(
                1,
                "INC-005 - Police Emergency"
        );

        if (inserted) {
            System.out.println("Report inserted successfully!");
        } else {
            System.out.println("Invalid position!");
        }

        reports.display();
        System.out.println("Total Reports: " + reports.getSize());
        
        System.out.println("\n=== REMOVE FIRST REPORT ===");

        boolean removed = reports.removeFirst();

        if (removed) {
            System.out.println("First report removed successfully!");
        } else {
            System.out.println("The list is empty.");
        }

        reports.display();

        System.out.println("Total Reports: " + reports.getSize());
        System.out.println("\n=== REMOVE LAST REPORT ===");

        boolean lastRemoved = reports.removeLast();

        if (lastRemoved) {
        System.out.println("Last report removed successfully!");
        } else {
        System.out.println("The list is empty.");
        }

        reports.display();
        System.out.println("Total Reports: " + reports.getSize());
        System.out.println("\n=== PEEK FIRST REPORT ===");

        String firstReport = reports.peekFirst();

        if (firstReport != null) {
        System.out.println("First Report: " + firstReport);
        } else {
        System.out.println("The list is empty.");
        }

        System.out.println("Total Reports: " + reports.getSize());
        System.out.println("\n=== CHECK INCIDENT ID ===");

        boolean found = reports.contains("INC-005");

        if (found) {
        System.out.println("Incident ID exists!");
        } else {
        System.out.println("Incident ID not found!");
        }
        System.out.println("\n=== CLEAR ALL REPORTS ===");

        reports.clear();

        System.out.println("All reports have been removed.");
        reports.display();
        System.out.println("Total Reports: " + reports.getSize());
    }
}

