public class Main {

    public static void main(String[] args) {


        Human me = new Human();


        me.setAge(28);

        me.setName("Aleksandr");

        /*
        me.name = "Aleks";
        System.out.println(me.sayHello("Program2"));
        */

        me.setSurname("Zamiatin");

        System.out.println(me.sayHello("Program1"));


        Human he = new Human("Woman");



    }
}
