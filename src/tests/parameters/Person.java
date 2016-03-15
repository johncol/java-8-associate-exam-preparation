package tests.parameters;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person john = new Person("John");
        System.out.println(john.getName());
        updatePerson(john, "Alexander");
        System.out.println(john.getName());
        updatePersonInPlce(john, "Alexander");
        System.out.println(john.getName());
    }


    public static void updatePerson(Person person, String newName) {
        person = new Person(newName);
    }

    public static void updatePersonInPlce(Person person, String newName) {
        person.setName(newName);
    }
}
