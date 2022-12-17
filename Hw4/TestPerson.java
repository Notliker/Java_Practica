package Hw4;


public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person(20, "Kirill");
        Person person2 = new Person(22,"Selvester");
        person1.PersonTalk();
        person2.PersonTalk();
        person1.PersonMove();
        person2.PersonMove();

    }
}
