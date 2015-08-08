/**
 * Created by cawa on 07.08.15.
 */
public class Human {

    private String name;
    String surname;

    int age;

    public Human() {
        System.out.println("Hello from Human class constructor");
    }

    public Human(String name) {
        this();
        this.name = name;
        System.out.println("Hello from Human class constructor");
        System.out.println("My name is: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String sayHello(String name){

        String info = getName()+ " "+getSurname();

        return "Hello "+ name + ", from " + info;
    }
}
