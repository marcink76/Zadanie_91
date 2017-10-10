import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddPerson {

    public void addPerson(Person person) throws IncorrectAgeException, NameUndefinedException, IncorrectPeselException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();

        if (name == null || lastName == null || name.length() < 2 || lastName.length() < 2) {
            throw new NameUndefinedException("Podaj poprawne imie i nazwisko");

        } else {
            person.setName(name);
            person.setLastName(lastName);
        }

        System.out.println("Podaj wiek");
        int age = scanner.nextInt();

        if (age < 1) {
            throw new IncorrectAgeException("Podaj wiek większy od 1");
        } else {
            person.setAge(age);
            System.out.println("wiek poprawny");
        }

        System.out.println("Podaj PESEL");
        String pesel = scanner.next();

        Pattern pattern = Pattern.compile("[0-9]{11}");
        Matcher matcher = pattern.matcher(pesel);
        boolean match = matcher.find();

        if (!match) {
            throw new IncorrectPeselException("Prosze podać właściwy nr PESEL!");
        } else {
            person.setPesel(pesel);
            System.out.println("PESEL poprawny");
        }
    }
}
