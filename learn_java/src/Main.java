
public class Main {

    public static void main(String[] args) {

      /*  String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "world";
        words[2] = "!";

        System.out.println(words[1]);
        System.out.println(words[2]);

        String[] fruits = {"apple", "bannana"};

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        int val = 123;

        String text;
        String[] texts = new String[2];

        texts[1] = "dasdasd";

        for (String s : texts) {
            System.out.println(s);
        }*/

        int[][] values ={
                {1,2,3},
                {4,5,6}
        };

        /*for (int[] value : values) {
            System.out.println(value);
            for (int i : value) {
                System.out.println(i);
            }
        }*/


        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                System.out.print(values[row][col] + "\t");
            }
            System.out.println();
        }

        System.out.println("==============================");

        String[][] texts = new String[2][2];

        System.out.println(texts[0][1]);

    }
}
