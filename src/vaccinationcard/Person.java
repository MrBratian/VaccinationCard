package vaccinationcard;

import java.time.LocalDate;

class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private PersonalId id;

    public Person(String name, String surname, LocalDate dateOfBirth, PersonalId id) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public PersonalId getId() {
        return id;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(PersonalId id) {
        this.id = id;
    }
}