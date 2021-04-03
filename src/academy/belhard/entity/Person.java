package academy.belhard.entity;

public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
