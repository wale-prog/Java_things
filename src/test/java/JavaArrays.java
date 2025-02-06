import java.util.ArrayList;

public class JavaArrays {

    public static void arrays() {
        String[] animals = {"Dog", "Zebra", "Chicken", "Fox", "Goat"};

        // ["Dog", "Zebra", "Chicken", "Fox", "Goat"]
        // [0, 1, 2, 3, 4]
        System.out.println(animals.length);
        System.out.println(animals[2]);

        for (int i = 0; i < animals.length; i += 2) {
            System.out.println(animals[i]);
        }
        animals[2] = "Bull";
        System.out.println("The changed animal value is " + animals[2]);

    }

    public static void arrayList() {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Toyota");
        cars.add("Volvo");
        cars.add(1, "Mazda");
        // ["Toyota", "Mazda", "Volvo"]
        try {
            String car = cars.get(2);
            int num = Integer.parseInt("get");
        }catch(IndexOutOfBoundsException | NumberFormatException error) {
            System.out.println(error.getMessage());
            System.out.println("An error occurred");
        }finally {
            System.out.println("This is the end of the try-catch block");
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }

    /*

    try{

    }
     */

    public static void main(String[] args) {
//        arrays();
        arrayList();
    }
}
