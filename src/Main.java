public class Main {
    public static void main(String[] args) throws IncorrectAgeException, NameUndefinedException, IncorrectPeselException {

        Person person = new Person();

        AddPerson addPerson = new AddPerson();

        addPerson.addPerson(person);

        ShowInfo.showInfo(person);
    }
}

