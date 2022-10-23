import java.util.HashSet;
import java.util.Set;

public class PassBook {
    private Set<Passport> passports;

    public PassBook() {
        passports = new HashSet<>();
    }

    public void addPassport(Passport... passport) {
        for (Passport p :
                passport) {
            if (!passports.add(p)) {
                System.out.println("Паспорт уже зарегистрирован!");
            } else if (sameNumber(p) != null ) {
                Passport pass = sameNumber(p);
                pass.setLastName(p.getLastName());
                pass.setFirstName(p.getFirstName());
                pass.setMiddleName(p.getMiddleName());
                pass.setBirthDate(p.getBirthDate());
            } else {

            }
        }
    }

    public Set<Passport> getPassports() {
        return passports;
    }

    private Passport sameNumber(Passport passport) {
        for (Passport p :
                passports) {
            if (p.getPassNumber() == passport.getPassNumber()) {
                return p;
            }
        }
        return null;
    }
}
