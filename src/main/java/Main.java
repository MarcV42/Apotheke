public class Main {
    public static void main(String[] args) {
        // Erstelle eine Apotheke
        Apotheke apotheke = new Apotheke();

        // Füge Medication zur Apotheke hinzu
        apotheke.addMedication("Aspirin", 5.99, 100);
        apotheke.addMedication("Paracetamol", 3.49, 50);
        apotheke.addMedication("Ibuprofen", 4.99, 75);

        // Gib die Anzahl der Medication in der Apotheke aus
        int count = apotheke.getCount();
        System.out.println("Anzahl der Medication in der Apotheke: " + count);

        // Gib die Informationen zu einer bestimmten Medication aus
        Medication aspirin = apotheke.getMedication("Aspirin");
        if (aspirin != null) {
            System.out.println("Informationen zu Aspirin:");
            System.out.println("Name: " + aspirin.getName());
            System.out.println("Preis: " + aspirin.getPrice());
            System.out.println("Verfügbarkeit: " + aspirin.getAvailability());
        } else {
            System.out.println("Aspirin nicht gefunden.");
        }

        // Aktualisiere die Verfügbarkeit von Medication
        apotheke.updateAvailability("Ibuprofen", 60);

        // Gib alle Medication in der Apotheke aus
        System.out.println("Alle Medication in der Apotheke:");
        apotheke.printAllMedication();

        // Suche nach einer bestimmten Medication
        Medication searchedMedication = apotheke.find("Paracetamol");
        if (searchedMedication != null) {
            System.out.println("Gefundene Medication:");
            System.out.println("Name: " + searchedMedication.getName());
            System.out.println("Preis: " + searchedMedication.getPrice());
            System.out.println("Verfügbarkeit: " + searchedMedication.getAvailability());
        } else {
            System.out.println("Medication nicht gefunden.");
        }

        // Lösche eine Medication aus der Apotheke
        apotheke.delete("Paracetamol");

        // Gib die aktualisierte Liste der Medication aus
        System.out.println("Aktualisierte Liste der Medication:");
        apotheke.printAllMedication();

        System.out.println(apotheke.getCount());
    }

}
