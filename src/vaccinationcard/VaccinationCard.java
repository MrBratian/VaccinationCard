package vaccinationcard;

import java.time.LocalDate;

class VaccinationCard {
    private Person patient;
    private Person vaccinator;
    private LocalDate vaccinationDate;
    private String vaccineMaker;

    public VaccinationCard(Person patient, Person vaccinator, LocalDate vaccinationDate, String vaccineMaker) {
        this.patient = patient;
        this.vaccinator = vaccinator;
        this.vaccinationDate = vaccinationDate;
        this.vaccineMaker = vaccineMaker;
    }

    public void printVaccinationCard() {
        System.out.println("Vaccination Card");
        System.out.println("-----------------");
        System.out.println("Patient: " + patient.getName() + " " + patient.getSurname());
        System.out.println("Patient ID: " + patient.getId().getType() + " " + patient.getId().getNumber());
        System.out.println("Vaccinator: " + vaccinator.getName() + " " + vaccinator.getSurname());
        System.out.println("Vaccination Date: " + vaccinationDate);
        System.out.println("Vaccine Maker: " + vaccineMaker);
    }
}