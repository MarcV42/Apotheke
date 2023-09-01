
import java.util.HashMap;
import java.util.Map;

public class Apotheke{
    private Map<String, Medication> medicationMap = new HashMap<>();

    public void addMedication(String name, double price, int availability) {
        Medication medication = new Medication(name, price, availability);
        medicationMap.put(name, medication);
    }

    public Medication getMedication(String name) {
        return medicationMap.get(name);
    }

    public void updateAvailability(String name, int availability) {
        Medication medication = medicationMap.get(name);
        if (medication != null) {
            medicationMap.put(name, new Medication(name, medication.getPrice(), availability));
        }
    }

    // Weitere Methoden für die anderen Schritte implementieren
    public int getCount() {
        return medicationMap.size();
    }

    public void save(Medication medication) {
        medicationMap.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return medicationMap.get(medicationName);
    }

    public void delete(String medicationName) {
        medicationMap.remove(medicationName);
    }

    public void printAllMedication() {
        for (Map.Entry<String, Medication> entry : medicationMap.entrySet()) {
            Medication medication = entry.getValue();
            System.out.println("Name: " + medication.getName());
            System.out.println("Price: " + medication.getPrice());
            System.out.println("Availability: " + medication.getAvailability());
            System.out.println();
        }
    }

}


