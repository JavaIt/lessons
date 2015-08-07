/**
 *
 */
public class Main {

    public static void main(String[] args) {

        // new class instance Fruit
        Fruit fruit = new Fruit();

        fruit.name = "Apple";
        fruit.color = "Red";
        fruit.weight = 2.44;

        System.out.println(fruit.color);


        fruit.sayHello();
        fruit.about();
    }
}
