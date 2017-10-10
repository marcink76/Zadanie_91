public class ShowInfo {
    public static void showInfo(Person person) {
        System.out.println(person.getName());
        System.out.println(person.getLastName());
        System.out.println("lat: " + person.getAge());
        System.out.println(person.getPesel());
    }
}
