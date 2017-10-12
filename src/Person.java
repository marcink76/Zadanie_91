import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String name = "";
    private String lastName = "";
    private int age = 0;
    private String pesel = "";

    public Person(String name, String lastName, String pesel, int age) throws NameUndefinedException,
            IncorrectAgeException, IncorrectPeselException {

        try {
            if (name == null || lastName == null || name.length() < 2 || lastName.length() < 2) {
                throw new NameUndefinedException("Podaj poprawne imie i nazwisko");
            } else {
                this.name = name;
                this.lastName = lastName;
            }
        } catch (NameUndefinedException e) {
            System.out.println("Podaj poprawne nazwisko");
        }

        try {
            if (age < 1) {
                throw new IncorrectAgeException("Podaj wiek większy od 1");
            } else {
                this.age = age;
                System.out.println("wiek poprawny");
            }
        } catch (IncorrectAgeException e) {
            System.out.println("Podaj poprawny wiek!");
        }

        Pattern pattern = Pattern.compile("[0-9]{11}");
        Matcher matcher = pattern.matcher(pesel);
        boolean match = matcher.find();

        try{
            if (!match) {
                throw new IncorrectPeselException("Prosze podać właściwy nr PESEL!");
            } else {
                this.pesel = pesel;
                System.out.println("PESEL poprawny");
            }
        }catch (IncorrectPeselException e){
            System.out.println("Podaj poprawny PESEL");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + age + " " + pesel;
    }
}