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
            Passport finded = passports.get(p.getPassNumber());
            if (passports.containsKey(p.getPassNumber()) && finded.equals(p)) {
                System.out.println("Паспорт уже зарегистрирован!");
            } else if (passports.containsKey(p.getPassNumber())) {
                finded.setLastName(p.getLastName());
                finded.setFirstName(p.getFirstName());
                finded.setMiddleName(p.getMiddleName());
                finded.setBirthDate(p.getBirthDate());
            } else {
                passports.put(p.getPassNumber(), p);
            }
        }
    }

    public HashMap<Integer, Passport> getPassports() {
        return passports;
    }
}
