package vaccinationcard;

class PersonalId {
    private String type;
    private String number;

    public PersonalId(String type, String number) {
        this.type = type;
        this.number = number;
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}