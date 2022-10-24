import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PassBook {
    private HashMap<Integer, Passport> passports;

    public PassBook() {
        passports = new HashMap<>();
    }

    public void addPassport(Passport... passport) {
        for (Passport p :
                passport) {
            if (passports.containsKey(p.getPassNumber()) && passports.get(p.getPassNumber()).equals(p)) {
                System.out.println("Паспорт уже зарегистрирован!");
            } else if (passports.containsKey(p.getPassNumber())) {
                passports.get(p.getPassNumber()).setLastName(p.getLastName());
                passports.get(p.getPassNumber()).setFirstName(p.getFirstName());
                passports.get(p.getPassNumber()).setMiddleName(p.getMiddleName());
                passports.get(p.getPassNumber()).setBirthDate(p.getBirthDate());
            } else {
                passports.put(p.getPassNumber(), p);
            }
        }
    }

    public HashMap<Integer, Passport> getPassports() {
        return passports;
    }
}
