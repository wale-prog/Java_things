public class DataTypes {

        static String myName = "Joachim";
        static char myChar = 'A';
        static int myInteger = 7;

        public static int addition(int firstNumber, int secondNumber) {
            System.out.println("This is a number");
            return (firstNumber + secondNumber);
        }
        public static void operators() {
            // 6/2 = 3
            System.out.println("Modulo division " + 5 % 2);

            int myNum = 30;
            float myFloat = 0.0f;
            myFloat = (float) myNum;
            myNum = (int) myFloat;
        }

        public static void percentageCalculator() {
            int maxScore = 1000;
            int userScore = 300;

            float percentage = (float) 300 / 1000 * 100f;
            System.out.println(percentage);
        }

    public static void main(String[] args) {
        System.out.println(addition(4, 5));
        System.out.println(addition(40,90));
    }

    }
