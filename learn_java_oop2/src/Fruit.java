/**
 * Created by cawa on 07.08.15.
 */
public class Fruit {

    String name;
    String color;

    double price;
    double weight;


    void about() {
        System.out.println("I'm fruit:" + name);
        System.out.println("My color is:" + color);
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    public double getPrice() {
        return price;
    }

    String calculateWeightPrice() {

        double weightPrice = price * weight;

        //System.out.println("Price for: " +weight+ " are: "+ weightPrice);

        String output = "Price for: " + weight + " are: " + weightPrice;

        return output;

    }

}
