public class ControlFlow {

    public static void ifStatement() {

        if(2 < 3) {
            System.out.println("The condition resolves to true");
        }else {
            System.out.println("The conditions resolves to false");
        }

        int count = 19;


        if (count < 5) {
            System.out.println("5 is greater than count");
        }else if(count > 5) {
            System.out.println("5 is less than count");
        }else {
            System.out.println(count);
        }

    }
    public static void dayOfWeek(int numOfWeek) {

        switch (numOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default: throw new IllegalArgumentException("The number of week with value " + numOfWeek + " does not exist");
        }
    }

    public static void main(String[] args) {
//        ifStatement();
        dayOfWeek(8);
//        dayOfWeek(2);
    }
}
