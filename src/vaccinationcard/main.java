package vaccinationcard;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        // Crear identificaciones personales
        PersonalId patientId = new PersonalId("DNI", "12345678A");
        PersonalId vaccinatorId = new PersonalId("DNI", "87654321B");

        // Crear personas
        Person patient = new Person("Juan", "Pérez", LocalDate.of(1990, 5, 14), patientId);
        Person vaccinator = new Person("Ana", "García", LocalDate.of(1985, 3, 22), vaccinatorId);

        // Crear tarjeta de vacunación
        VaccinationCard card = new VaccinationCard(patient, vaccinator, LocalDate.of(2024, 10, 1), "Pfizer");

        // Imprimir la tarjeta de vacunación
        card.printVaccinationCard();
    }
}
