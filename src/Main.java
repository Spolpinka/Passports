import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int maxPersons = 10;
        PassBook firstBook = new PassBook();
        int existNumb = 0;
        //добавляем 10 рандомных паспортов
        for (int i = 0; i < maxPersons; i++) {
            int passNumber = 100000 + random.nextInt(899999);
            Passport pass = new Passport(passNumber, "Иванов" + i, "Иван", "Иванович",
                    LocalDate.now().minusYears(18 + i));
            firstBook.addPassport(pass);
            System.out.println(pass);
            if (i == 2) {
                existNumb = passNumber;
            }
        }
        //и один без отчества для проверки
        Passport noMidName = new Passport(100000 + random.nextInt(899999), "Петров", "Вениамин",
                LocalDate.now().minusYears(25));
        firstBook.addPassport(noMidName);
        //продуем добавить паспорт с тем же номером и выводим в печать все паспорта для проверки
        System.out.println("берем существующий паспорт № " + existNumb);
        Passport solomon = new Passport(existNumb, "Цукерман", "Соломон", "Абрамович",
                LocalDate.now().minusYears(20));
        firstBook.addPassport(solomon);
        for (Passport p :
                firstBook.getPassports()) {
            System.out.println(p);
        }
    }
}