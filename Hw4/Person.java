package Hw4;


public class Person {
    private int age;
    private String fullName;

    public Person() { }
    public void PersonTalk(){
        System.out.println("Man " + fullName + " talk");
    }
    public void PersonMove(){
        System.out.println("Man " + fullName + " make push up");;
    }
    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }
}
