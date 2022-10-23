import java.time.LocalDate;

public class Passport {
    private int passNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;

    public Passport(int passNumber, String lastName, String firstName, LocalDate birthDate) {
        if (passNumber > 100000 ) {
            this.passNumber = passNumber;
        }
        if (lastName != null && !lastName.isBlank() && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
        if (firstName != null && !firstName.isBlank() && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
        if (birthDate.getYear() > 1900) {
            this.birthDate = birthDate;
        }
    }

    public Passport(int passNumber, String lastName, String firstName, String middleName, LocalDate birthDate) {
            if (passNumber > 100000) {
                this.passNumber = passNumber;
            }
            if (lastName != null && !lastName.isBlank() && !lastName.isEmpty()) {
                this.lastName = lastName;
            }
            if (firstName != null && !firstName.isBlank() && !firstName.isEmpty()) {
                this.firstName = firstName;
            }
            if (birthDate.getYear() > 1900) {
                this.birthDate = birthDate;
            }
            if (middleName != null && !middleName.isBlank() && !middleName.isEmpty()) {
                this.middleName = middleName;
            }
    }

    public int getPassNumber() {
        return passNumber;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isBlank() && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isBlank() && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public void setMiddleName(String middleName) {
        if (middleName != null && !middleName.isBlank() && !middleName.isEmpty()) {
            this.middleName = middleName;
        }
    }

    public void setBirthDate(LocalDate birthDate) {
        if (LocalDate.now().isAfter(birthDate) && birthDate.getYear() > 1990) {
            this.birthDate = birthDate;
        }
    }


    @Override
    public String toString() {
        return "Паспорт № " + passNumber +
                ", Фамилия: " + lastName +
                ", Имя " + firstName +
                ", Отчество " + middleName +
                ", дата рождения " + birthDate.getDayOfMonth() + "." + birthDate.getMonth() + "." + birthDate.getYear() + "года.";
    }
}
