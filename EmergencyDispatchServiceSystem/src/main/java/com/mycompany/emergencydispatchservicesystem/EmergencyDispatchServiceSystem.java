    

package com.mycompany.emergencydispatchservicesystem;

public class EmergencyDispatchServiceSystem {

    public static void main(String[] args) {

        EmergencyReport fire = new FireEmergency(
                "INC-001",
                "Juan Dela Cruz",
                "09123456789",
                "Lingion, Bukidnon",
                "House fire"
        );

        EmergencyReport medical = new MedicalEmergency(
                "INC-002",
                "Maria Santos",
                "09987654321",
                "Manolo Fortich, Bukidnon",
                "Patient needs medical assistance"
        );

        EmergencyReport accident = new AccidentEmergency(
                "INC-003",
                "Pedro Reyes",
                "09112223344",
                "Malaybalay, Bukidnon",
                "Road accident"
        );

        fire.displayReport();
        System.out.println();

        medical.displayReport();
        System.out.println();

        accident.displayReport();
    }
}

