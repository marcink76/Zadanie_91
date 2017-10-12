import java.util.Scanner;

public class AddPerson {

    public static void addPerson() throws IncorrectAgeException, NameUndefinedException, IncorrectPeselException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();

        System.out.println("Podaj wiek");
        int age = scanner.nextInt();

        System.out.println("Podaj PESEL");
        String pesel = scanner.next();

        Person person = new Person(name, lastName, pesel, age);

        System.out.println(person);
    }
}

